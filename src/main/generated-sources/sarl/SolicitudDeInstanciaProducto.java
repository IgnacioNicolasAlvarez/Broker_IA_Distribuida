import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Event;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@SarlSpecification("0.9")
@SarlElementType(15)
@SuppressWarnings("all")
public class SolicitudDeInstanciaProducto extends Event {
  public Integer codigoProducto;
  
  public SolicitudDeInstanciaProducto(final Integer v) {
    this.codigoProducto = v;
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
    SolicitudDeInstanciaProducto other = (SolicitudDeInstanciaProducto) obj;
    if (other.codigoProducto != this.codigoProducto)
      return false;
    return super.equals(obj);
  }
  
  @Override
  @Pure
  @SyntheticMember
  public int hashCode() {
    int result = super.hashCode();
    final int prime = 31;
    result = prime * result + this.codigoProducto;
    return result;
  }
  
  /**
   * Returns a String representation of the SolicitudDeInstanciaProducto event's attributes only.
   */
  @SyntheticMember
  @Pure
  protected void toString(final ToStringBuilder builder) {
    super.toString(builder);
    builder.add("codigoProducto", this.codigoProducto);
  }
  
  @SyntheticMember
  private static final long serialVersionUID = 33952510L;
}
