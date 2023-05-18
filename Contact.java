public class Contact  implements Prototype{
    String Nome;
    String Fone;
    String Email;

    public  Contact(String nome, String fone , String email){

            this.Nome = nome;
            this.Fone = fone;
            this.Email = email;
    }
    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public String getFone() {
        return Fone;
    }
    public void setFone(String fone) {
        Fone = fone;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }
  
    @Override
    public Prototype clone(){
       
        try {
            return (Contact) super.clone();
        } catch (CloneNotSupportedException e) {
           
            e.printStackTrace();
        }
        return null;
    }
    
    public void imprimir (){
        System.out.println("Nome: "+Nome+" - Fone: "+ Fone +" - Email: "+Email);
    }
}
