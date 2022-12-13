public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        cliente.setNombre("Juan david");
        cliente.setedad(22);
        cliente.setTelefono(322548);

        cliente.getnombre();
        cliente.getedad();
        cliente.getTelefono();
        cliente.getcredito();
    }



}

 class persona{
    int edad;
    String nombre;
    int telefono;

     public void getedad(){
         System.out.println(this.edad);
     }
     public int setedad(int edad){
          this.edad= edad;
         return this.edad;
     }

     public void getTelefono(){
         System.out.println(this.telefono);
     }
     public int setTelefono(int telefono){
         this.telefono=telefono;
         return this.telefono;
     }

     public void getnombre(){
         System.out.println(this.nombre);
     }
     public String setNombre(String nombre){
         this.nombre = nombre;
         return this.nombre;
     }
}

class Cliente extends persona{
    private String credito="CDT";


    public void getcredito(){
        System.out.println(this.credito);
    }
    public String setnombre(String credito){
        credito= this.credito;
        return this.credito;
    }

}