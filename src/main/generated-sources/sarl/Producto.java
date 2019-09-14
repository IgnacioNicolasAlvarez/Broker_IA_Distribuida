import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import org.eclipse.xtext.xbase.lib.Pure;

/**
 * @author ina
 */
@SarlSpecification("0.9")
@SarlElementType(10)
@SuppressWarnings("all")
public class Producto {
  private Integer codigo;
  
  private Double precio;
  
  private Integer stock;
  
  public Producto(final Integer v, final Double x, final Integer s) {
    this.codigo = v;
    this.precio = x;
    this.stock = s;
  }
  
  @Pure
  public Integer getCodigo() {
    return this.codigo;
  }
  
  @Pure
  public Integer getStock() {
    return this.stock;
  }
  
  @Pure
  public Double getPrecio() {
    return this.precio;
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
    Producto other = (Producto) obj;
    if (other.codigo != this.codigo)
      return false;
    if (Double.doubleToLongBits(other.precio) != Double.doubleToLongBits(this.precio))
      return false;
    if (other.stock != this.stock)
      return false;
    return super.equals(obj);
  }
  
  @Override
  @Pure
  @SyntheticMember
  public int hashCode() {
    int result = super.hashCode();
    final int prime = 31;
    result = prime * result + this.codigo;
    result = prime * result + (int) (Double.doubleToLongBits(this.precio) ^ (Double.doubleToLongBits(this.precio) >>> 32));
    result = prime * result + this.stock;
    return result;
  }
}
