public class Product {
    public Product(int _id, String _name, String _description,double _price,int _stockAmount,String _renk){
        System.out.println("Yapıcı Blok Çalıştı.");
        this._id=_id;
        this._name=_name;
        this._description=_description;
        this._price=_price;
        this._stockAmount=_stockAmount;
        this._renk=_renk;
    }
    public Product(){

    }
    private int _id;
    private String _name;
    private String _description;
    private double _price;
    private int _stockAmount;
    private String _renk;
    private String _kod;

    public int getId() {
        return _id;
    }
    public void setId(int id){
       _id=id;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_description() {
        return _description;
    }

    public void set_description(String _description) {
        this._description = _description;
    }

    public double get_price() {
        return _price;
    }

    public void set_price(double _price) {
        this._price = _price;
    }

    public int get_stockAmount() {
        return _stockAmount;
    }

    public void set_stockAmount(int _stockAmount) {
        this._stockAmount = _stockAmount;
    }

    public String get_renk() {
        return _renk;
    }

    public void set_renk(String _renk) {
        this._renk = _renk;
    }

    public String get_kod() {
        return this._name.substring(0,1)+_id;
    }

}
