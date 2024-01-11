public class Author {

    private int id ;
    private String firstname ;
    private String lastname ;
    private int age ;
    private String[] booklist ;

    public Author(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public Author (){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getBooklist() {
        return booklist;
    }

    public void setBooklist(String[] booklist) {
        this.booklist = booklist;
    }
}
