import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Event;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@SarlSpecification("0.9")
@SarlElementType(15)
@SuppressWarnings("all")
public class BialDeProveedor extends Event {
  public Double deliver;
  
  public Double price;
  
  public BialDeProveedor(final Double v, final Double x) {
    this.deliver = v;
    this.price = x;
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
    BialDeProveedor other = (BialDeProveedor) obj;
    if (Double.doubleToLongBits(other.deliver) != Double.doubleToLongBits(this.deliver))
      return false;
    if (Double.doubleToLongBits(other.price) != Double.doubleToLongBits(this.price))
      return false;
    return super.equals(obj);
  }
  
  @Override
  @Pure
  @SyntheticMember
  public int hashCode() {
    int result = super.hashCode();
    final int prime = 31;
    result = prime * result + (int) (Double.doubleToLongBits(this.deliver) ^ (Double.doubleToLongBits(this.deliver) >>> 32));
    result = prime * result + (int) (Double.doubleToLongBits(this.price) ^ (Double.doubleToLongBits(this.price) >>> 32));
    return result;
  }
  
  /**
   * Returns a String representation of the BialDeProveedor event's attributes only.
   */
  @SyntheticMember
  @Pure
  protected void toString(final ToStringBuilder builder) {
    super.toString(builder);
    builder.add("deliver", this.deliver);
    builder.add("price", this.price);
  }
}
