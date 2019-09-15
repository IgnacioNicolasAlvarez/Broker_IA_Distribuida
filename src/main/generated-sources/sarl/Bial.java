import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import org.eclipse.xtext.xbase.lib.DoubleExtensions;
import org.eclipse.xtext.xbase.lib.Pure;

/**
 * @author ina
 */
@SarlSpecification("0.9")
@SarlElementType(10)
@SuppressWarnings("all")
public class Bial {
  private Integer codigo;
  
  private Double precio;
  
  private Double deliver;
  
  public Bial(final Integer v, final Double x, final Double s) {
    this.codigo = v;
    this.precio = x;
    this.deliver = s;
  }
  
  @Pure
  public Integer getCodigo() {
    return this.codigo;
  }
  
  @Pure
  public Double getDeliver() {
    return this.deliver;
  }
  
  @Pure
  public Double getPrecio() {
    return this.precio;
  }
  
  @Pure
  public Double getPrecioYDeliver() {
    return Double.valueOf(DoubleExtensions.operator_plus(
      this.precio, this.deliver));
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
    Bial other = (Bial) obj;
    if (other.codigo != this.codigo)
      return false;
    if (Double.doubleToLongBits(other.precio) != Double.doubleToLongBits(this.precio))
      return false;
    if (Double.doubleToLongBits(other.deliver) != Double.doubleToLongBits(this.deliver))
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
    result = prime * result + (int) (Double.doubleToLongBits(this.deliver) ^ (Double.doubleToLongBits(this.deliver) >>> 32));
    return result;
  }
}
