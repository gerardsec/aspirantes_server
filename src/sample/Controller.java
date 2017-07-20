package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Controller {
    public Button buscaBtn;
    public TextArea resultadoTexto;
    public TextField claveBuscar;

    public static AspiranteREntity buscaClave(String claveBuscar) {
        System.out.println("Entra a buscaClave" + claveBuscar);
        AspiranteREntity personaBuscada = new AspiranteREntity();

        System.out.println("antes getsession");
        final Session miSesion = sample.Main_hibernate.getSession();
        System.out.println("después getssess");
        Transaction tx = null;

        try {
            tx = miSesion.beginTransaction();
            personaBuscada = miSesion.get(AspiranteREntity.class, claveBuscar);
            tx.commit();

        } catch (HibernateException e) {
            System.out.println("****Catch");
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            System.out.println("****Cerrando sesión");
            miSesion.close();

        }
        return personaBuscada;
    }

    public void buscarAspirante(ActionEvent actionEvent) {
        String claveBuscarTxt = claveBuscar.getText();
        AspiranteREntity personaBuscada = buscaClave(claveBuscarTxt);
        if (personaBuscada == null) {
            System.out.println("No se encontró");
            resultadoTexto.setText("No se encontró");
        } else {
            resultadoTexto.setText(personaBuscada.getActualizaFe().toString());
        }
    }
}
