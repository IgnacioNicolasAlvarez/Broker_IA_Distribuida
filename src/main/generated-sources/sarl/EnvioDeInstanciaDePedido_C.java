import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Event;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@SarlSpecification("0.9")
@SarlElementType(15)
@SuppressWarnings("all")
public class EnvioDeInstanciaDePedido_C extends Event {
  public boolean fueEnviado;
  
  public EnvioDeInstanciaDePedido_C(final boolean v) {
    this.fueEnviado = v;
  }
  
  @Override
  @Pure
  @SyntheticMember
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    EnvioDeInstanciaDePedido_C other = (EnvioDeInstanciaDePedido_C) obj;
    if (other.fueEnviado != this.fueEnviado)
      return false;
    return super.equals(obj);
  }
  
  @Override
  @Pure
  @SyntheticMember
  public int hashCode() {
    int result = super.hashCode();
    final int prime = 31;
    result = prime * result + (this.fueEnviado ? 1231 : 1237);
    return result;
  }
  
  /**
   * Returns a String representation of the EnvioDeInstanciaDePedido_C event's attributes only.
   */
  @SyntheticMember
  @Pure
  protected void toString(final ToStringBuilder builder) {
    super.toString(builder);
    builder.add("fueEnviado", this.fueEnviado);
  }
  
  @SyntheticMember
  private static final long serialVersionUID = 3075666783L;
}
