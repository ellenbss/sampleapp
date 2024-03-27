package elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	public By make = By.id("make");
	public By kw = By.id("engineperformance");
	public By dateOfManufacture = By.id("dateofmanufacture");
	public By numberOfSeats = By.id("numberofseats");
	public By fuelType = By.id("fuel");
	public By listPrice = By.id("listprice");
	public By licensePlateNumber = By.id("licenseplatenumber");
	public By annualMileage  = By.id("annualmileage");
	public By btnNext  = By.id("nextenterinsurantdata");
	public By firstname  = By.id("firstname");
	public By lastName = By.id("lastname");
	public By birthdate = By.id("birthdate");
	public By streetAdress = By.id("streetaddress");
	public By country = By.id("country");
	public By zipCode = By.id("zipcode");
	public By city = By.id("city");
	public By occupation = By.id("occupation");
	public By webSite = By.id("website");
	public By btnPicture = By.id("open");
	public By stratDate = By.id("startdate");
	public By gender = By.xpath("//*[@id='insurance-form']/div/section[2]/div[4]/p/label[1]/span");
    public By hobbies = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]/span");
    public By btnNextInsurant = By.id("nextenterproductdata");
    public By starDate = By.id("startdate");
    public By optionalProducts = By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]/span");
    public By btnNextProduct = By.id("nextselectpriceoption");
    public By pictur = By.id("picture");
    public By btnNextSelectPrice = By.xpath("//*[@id=\"nextsendquote\"]");
    public By email = By.id("email");
    public By phone = By.id("phone");
    public By username = By.id("username");
    public By password = By.id("password");
    public By confirmPassword = By.id("confirmpassword");
    public By btnSend = By.id("sendemail");
}
