package app.client.vistaPrincipal;

//@author AndresFWilt

public class VistaPrincipalComponent {

    private VistaPrincipalTemplate vistaPrincipalTemplate;

    public VistaPrincipalComponent(){
        this.vistaPrincipalTemplate= new VistaPrincipalTemplate(this);
        vistaPrincipalTemplate.setName("Vista Principal");
    }

    public VistaPrincipalTemplate getVistaPrincipalTemplate(){
        return this.vistaPrincipalTemplate;
    }
}
