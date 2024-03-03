//Tạo lớp Person chứa các thông tin:
//        - Tên
//        - Giới tính
//        - Ngày sinh
//        - Địa chỉ
//        1. Lớp Person bao gồm đầy đủ các phương thức getter, setter, constructor không tham số, constructor đầy đủ tham số
//        2. Viết phương thức inputInfo() đểnhập thông tin Person từ bàn phím
//        3. Viết phương thức showInfo() đểhiển thị tất cả thông tin Person


import java.awt.dnd.DropTarget;
import java.util.Scanner;

public class Person {
public String Name;
public String Gender;
public int DateOfBirth;
public  String Address;
       //Contructor không tham số
       public Person(){

       }

    //Contructor có tham số
    public Person( String Name,String Gender,int DateOfBirth,String Address  ){
              this.Name = Name;
              this.Gender = Gender;
              this.DateOfBirth = DateOfBirth;
              this.Address = Address;

    }

    // Getter và Setter cho các thuộc tính
    public  String getName(){
           return  Name;
    }
    public void  setName(String Name){
        this.Name = Name;
    }

    public  String Gender(){
        return  Gender;
    }
    public void  setGender(String Gender){
        this.Gender = Gender;
    }

    public  int DateOfBirth(){
        return  DateOfBirth;
    }
    public void  setDateOfBirth(int DataOfBirth){
        this.DateOfBirth = DataOfBirth;
    }

    public  String Address(){
        return  Address;
    }
    public void  setAddress(String Address){
        this.Address = Address;
    }
    // hàm nhập thông tin

    public void inputinfo(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name:");
        this.Name = sc.nextLine();
        System.out.println("Enter Gender:");
        this.Gender = sc.nextLine();
        System.out.println("Enter DataOfBirth:");
        this.DateOfBirth = sc.nextInt();
        System.out.println("Enter Address:");
        sc= new Scanner(System.in);
        this.Address = sc.nextLine();

    }


    // hàm show thông tin
       public  void showInfo(){
           System.out.println("Name:"+Name);
           System.out.println("Gender:"+Gender);
           System.out.println("DataOfBirth:"+DateOfBirth);
           System.out.println("Addres:"+Address);

       }

    public static void main(String[] args) {
        Person person = new Person();
        person.inputinfo();
        System.out.println("/n Thong tin person:");
        person.showInfo();
    }
}
