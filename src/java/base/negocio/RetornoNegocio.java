package base.negocio;

public class RetornoNegocio {
    
    private boolean valido;
    private String retornoMsg;
    
    public RetornoNegocio (boolean valido, String retornoMsg) {
        this.valido = valido;
        this.retornoMsg = retornoMsg;
    }

    public boolean isValido() {
        return valido;
    }

    public void setValido(boolean valido) {
        this.valido = valido;
    }

    public String getRetornoMsg() {
        return retornoMsg;
    }

    public void setRetornoMsg(String retornoMsg) {
        this.retornoMsg = retornoMsg;
    }
}
