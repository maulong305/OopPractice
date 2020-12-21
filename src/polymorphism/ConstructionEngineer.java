package polymorphism;

public class ConstructionEngineer extends Engineer{
    @Override
    String chuyenNganh(){
        return "kỹ sư cầu đường";
    }
    String chuyenNganh(String mes){
        return mes;
    }
}
