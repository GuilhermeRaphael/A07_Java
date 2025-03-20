public class Triangulo {
   private double x;
   private double y;
   private double z;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public String Valida()
    {
        if (this.x > this.y + this.z || this.y > this.x + this.z || this.z > this.y + this.x){
            return ("Não forma um triângulo");
        }

        if (this.x == this.y && this.y == this.z){
            return ("Triangulo equilatero");
        }
        else if (this.x == this.y && this.y != this.z || this.y == this.z && this.z != this.x || this.x == this.z && this.z != this.y)
        {
            return ("Triangulo isóceles");
        }
        else if (this.x != this.y && this.y != this.z) {
            return ("Triangulo escaleno");
        }
        return "";
    }
}
