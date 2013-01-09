// Clase para la MuñecaSexy
class MuñecaSexy {
   private String nombre;
   private String usuario;
   public void follar() {
      System.out.println("Oh sí " + usuario + ", ¡fóllame más fuerte! ¡Folla a " + nombre + "!");
   }
   public MuñecaSexy(String mnombre, String musuario) {
      this.nombre = mnombre;
      this.usuario = musuario;
   }
}

public class Muñeca {
   public static void main(String[] args) {
      MuñecaSexy pepa = new MuñecaSexy(args[0], args[1]);
      pepa.follar();
   }
}
