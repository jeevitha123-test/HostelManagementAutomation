package com.hostelhub.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RoomPage {

	WebDriver driver;

	// Constructor
	public RoomPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	// ================= LOGIN =================

	@FindBy(xpath = "//a[text()='Login']")
	WebElement loginButton;

	public void clickLogin1() {

		loginButton.click();
	}

	@FindBy(xpath = "//input[@placeholder='you@example.com or 9000000000']")
	WebElement emailField;

	@FindBy(name = "password")
	WebElement passwordField;

	@FindBy(xpath = "//button[contains(text(),'Sign In')]")
	WebElement adminLoginButton;

	// ================= CLOCK POPUP =================

	@FindBy(xpath = "//button[text()='OK']")
	WebElement okButton;

	public void clickOkPopup() {

		try {

			if (okButton.isDisplayed()) {

				okButton.click();

				System.out.println("Popup handled successfully");
			}

		} catch (Exception e) {

			System.out.println("Popup not displayed");
		}
	}

	// ================= DASHBOARD NAVIGATION =================

	@FindBy(xpath = "//span[text()='My Hostels']")
	WebElement myHostelsMenu;

	@FindBy(xpath = "//span[text()='Inventory']")
	WebElement inventoryMenu;

	// ================= ROOM CREATION =================

	@FindBy(xpath = "//input[@placeholder='e.g. 101']")
	WebElement roomNumberField;

	@FindBy(xpath = "//input[@value='0'][1]")
	WebElement floorField;

	@FindBy(name = "room_type")
	WebElement roomTypeDropdown;

	public void scrollDown() {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(true);", floorField);
	}

	@FindBy(xpath = "(//input[@type='number'])[2]")
	WebElement totalBedsField;

	@FindBy(xpath = "(//input[@type='number'])[3]")
	WebElement dailyRentField;

	@FindBy(xpath = "(//input[@type='number'])[4]")
	WebElement monthlyRentField;

	@FindBy(xpath = "(//input[@type='number'])[5]")
	WebElement securityDepositField;

	@FindBy(xpath = "//input[@placeholder='e.g. 12x10 ft']")
	WebElement dimensionsField;

	@FindBy(xpath = "//button[text()='Create Room']")
	WebElement createRoomButton;

	// ================= BED CREATION =================

	@FindBy(xpath = "//label[contains(text(),'Room')]/following::select[1]")
	WebElement selectRoomDropdown;

	@FindBy(xpath = "//input[@placeholder='e.g. B1, B2']")
	WebElement bedNumberField;

	@FindBy(xpath = "//label[contains(text(),'Status')]/following::select[1]")
	WebElement statusDropdown;

	@FindBy(xpath = "//button[text()='Create Bed']")
	WebElement createBedButton;

	// ================= LOGIN METHODS =================

	public void clickLogin() {
		loginButton.click();
	}

	public void enterEmail(String email) {
		emailField.sendKeys(email);
	}

	public void enterPassword(String password) {
		passwordField.sendKeys(password);
	}

	public void clickAdminLogin() {
		adminLoginButton.click();
	}

	public void adminLogin(String email, String password) {

		clickLogin1();

		enterEmail(email);

		enterPassword(password);

		clickAdminLogin();

		// Handle popup after login
		clickOkPopup();
	}

	// ================= NAVIGATION METHODS =================

	public void clickMyHostels() {
		myHostelsMenu.click();
	}

	public void clickInventory() {

		// Handle popup before clicking Inventory
		clickOkPopup();

		inventoryMenu.click();
	}

	public void navigateToRoomPage() {

		clickMyHostels();

		clickInventory();

	}

	// ================= ROOM METHODS =================

	public void enterRoomNumber(String roomNo) {
		roomNumberField.sendKeys(roomNo);
	}

	public void enterFloor(String floor) {
		floorField.sendKeys(floor);
	}

	public void selectRoomType(String roomType) {

		Select sel = new Select(roomTypeDropdown);

		sel.selectByVisibleText(roomType);
	}

	public void enterTotalBeds(String beds) {
		totalBedsField.sendKeys(beds);
	}

	public void enterDailyRent(String rent) {
		dailyRentField.sendKeys(rent);
	}

	public void enterMonthlyRent(String rent) {
		monthlyRentField.sendKeys(rent);
	}

	public void enterSecurityDeposit(String deposit) {
		securityDepositField.sendKeys(deposit);
	}

	public void enterDimensions(String dimensions) {
		dimensionsField.sendKeys(dimensions);
	}

	public void clickCreateRoom() {
		createRoomButton.click();
	}

	// ================= COMPLETE ROOM FLOW =================

	public void createRoom(String roomNo, String floor, String roomType, String beds, String dailyRent,
			String monthlyRent, String deposit, String dimensions) {

		enterRoomNumber(roomNo);

		enterFloor(floor);

		selectRoomType(roomType);

		enterTotalBeds(beds);

		enterDailyRent(dailyRent);

		enterMonthlyRent(monthlyRent);

		enterSecurityDeposit(deposit);

		enterDimensions(dimensions);

		clickCreateRoom();

		System.out.println("Room Created Successfully");
	}

	// ================= BED METHODS =================

	public void selectRoom(String roomName) {

		Select roomSelect = new Select(selectRoomDropdown);

		// Print dropdown values
		for (WebElement option : roomSelect.getOptions()) {

			System.out.println(option.getText());
		}

		roomSelect.selectByVisibleText(roomName);
	}

	public void enterBedNumber(String bedNo) {

		bedNumberField.clear();

		bedNumberField.sendKeys(bedNo);
	}

	public void selectBedStatus(String status) {

		Select statusSelect = new Select(statusDropdown);

		statusSelect.selectByVisibleText(status);
	}

	public void clickCreateBed() {

		createBedButton.click();
	}

	// ================= COMPLETE BED FLOW =================

	public void createBeds(String roomName, int totalBeds) {

		for (int i = 1; i <= totalBeds; i++) {

			// Select Room
			selectRoom(roomName);

			// Enter Bed Number
			enterBedNumber("B" + i);

			// Select Status
			selectBedStatus("Available");

			// Click Create Bed
			clickCreateBed();

			System.out.println("Created Bed : B" + i);
		}
	}
}