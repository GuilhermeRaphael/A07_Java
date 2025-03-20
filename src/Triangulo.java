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

    public String Valida() {

        if (this.x + this.y > this.z || this.x + this.z > this.y || this.y + this.z > this.x) {
            if (this.x == this.y && this.y == this.z) {
                return ("Triangulo equilatero");
            } else if (this.x != this.y && this.x != this.z && this.y != this.z) {
                return ("Triangulo escaleno");
            } else
                return ("Triangulo isosceles");

        } else
                return "Nao formam um triangulo";
    }
}
        /* METODO DA PROFESSORA
        if (x+y>z && x+z>y && y+z>x)
        {
            if (x==y && y==z)
            {
                return "Triangulo equilatero";
            }
            else if (x!=y && x!=z && y!=z) {
                return "Triangulo escaleno";
            }
            else{
                return "Triangulo isosceles";
            }
        }
        else
            return "Não formam um triangulo";
    }
    }
}
*/