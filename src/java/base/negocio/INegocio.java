package base.negocio;

public interface INegocio<VO> {
    
    RetornoNegocio inserirValidar(VO vo);
    RetornoNegocio alterarValidar(VO vo);
    RetornoNegocio excluirValidar(VO vo);
}
