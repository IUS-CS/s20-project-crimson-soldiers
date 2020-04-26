package tests;

import functions.*;
import variables.ServiceSpecific;
import org.testng.annotations.Test;

public class MainTest {

	@Test(priority=0)
	public static void PageNavigation(){
		Common.refreshToFirstPage();
		Services.clickPage4();
		Services.clickPage2();
		Services.clickPage2();
		Services.clickPage1();

		Services.clickEndArrow();
		Services.clickBeginningArrow();
		Services.clickNextArrow();
		Services.clickBackArrow();

		Services.enterTextInSearchBar("library");
		if(!Common.getPageBodySource().contains("Library where students can study and rent books"))
			Common.logTestFail("Search issue");
		else
			Common.logTestPass("No Navigation Issues");
	}

	//Page 1
	@Test(priority=1)
	public static void IUSPolice() throws InterruptedException {
		Common.refreshToFirstPage();
		Services.clickIUSPolice();
		Common.SleepSeconds(2);
		if(!Common.getPageBodySource().contains(ServiceSpecific.IUSPolice.location))
			Common.logTestFail("Location Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.IUSPolice.hours))
			Common.logTestFail("Hours Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.IUSPolice.phoneNum))
			Common.logTestFail("Phone Number Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.IUSPolice.email))
			Common.logTestFail("Email Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.IUSPolice.desc))
			Common.logTestFail("Service Description Missing");
		System.out.println("IUS Police Test Success");
	}

	@Test(priority=2)
	public static void Athletics() throws InterruptedException {
		Common.refreshToFirstPage();
		Services.clickAthletics();
		Common.SleepSeconds(2);
		if(!Common.getPageBodySource().contains(ServiceSpecific.Athletics.location))
			Common.logTestFail("Location Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.Athletics.hours))
			Common.logTestFail("Hours Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.Athletics.phoneNum))
			Common.logTestFail("Phone Number Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.Athletics.email))
			Common.logTestFail("Email Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.Athletics.desc))
			Common.logTestFail("Service Description Missing");
		System.out.println("Athletics Test Success");
	}

	@Test(priority=2)
	public static void LanguageLab() throws InterruptedException {
		Common.refreshToFirstPage();
		Services.clickLanguageLab();
		Common.SleepSeconds(2);
		if(!Common.getPageBodySource().contains(ServiceSpecific.LangLab.location))
			Common.logTestFail("Location Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.LangLab.hours))
			Common.logTestFail("Hours Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.LangLab.phoneNum))
			Common.logTestFail("Phone Number Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.LangLab.email))
			Common.logTestFail("Email Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.LangLab.desc))
			Common.logTestFail("Service Description Missing");
		System.out.println("Language Lab Test Success");
	}

	@Test(priority=4)
	public static void Registrar() throws InterruptedException {
		Common.refreshToFirstPage();
		Services.clickRegistrar();
		Common.SleepSeconds(2);
		if(!Common.getPageBodySource().contains(ServiceSpecific.Registrar.location))
			Common.logTestFail("Location Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.Registrar.hours))
			Common.logTestFail("Hours Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.Registrar.phoneNum))
			Common.logTestFail("Phone Number Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.Registrar.email))
			Common.logTestFail("Email Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.Registrar.desc))
			Common.logTestFail("Service Description Missing");
		System.out.println("Registrar Test Success");
	}

	@Test(priority=5)
	public static void Admissions() throws InterruptedException {
		Common.refreshToFirstPage();
		Services.clickAdmissions();
		Common.SleepSeconds(2);
		if(!Common.getPageBodySource().contains(ServiceSpecific.Admissions.location))
			Common.logTestFail("Location Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.Admissions.hours))
			Common.logTestFail("Hours Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.Admissions.phoneNum))
			Common.logTestFail("Phone Number Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.Admissions.email))
			Common.logTestFail("Email Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.Admissions.desc))
			Common.logTestFail("Service Description Missing");
		System.out.println("Admissions Test Success");
	}

	@Test(priority=6)
	public static void AccountingServices() throws InterruptedException {
		Common.refreshToFirstPage();
		Services.clickAccountingServices();
		Common.SleepSeconds(2);
		if(!Common.getPageBodySource().contains(ServiceSpecific.AccountingServices.location))
			Common.logTestFail("Location Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.AccountingServices.hours))
			Common.logTestFail("Hours Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.AccountingServices.phoneNum))
			Common.logTestFail("Phone Number Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.AccountingServices.email))
			Common.logTestFail("Email Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.AccountingServices.desc))
			Common.logTestFail("Service Description Missing");
		System.out.println("Accounting Services Test Success");
	}

	@Test(priority=7)
	public static void TestingAndDisability() throws InterruptedException {
		Common.refreshToFirstPage();
		Services.clickTestingAndDisability();
		Common.SleepSeconds(2);
		if(!Common.getPageBodySource().contains(ServiceSpecific.TestingAndDisability.location))
			Common.logTestFail("Location Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.TestingAndDisability.hours))
			Common.logTestFail("Hours Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.TestingAndDisability.phoneNum))
			Common.logTestFail("Phone Number Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.TestingAndDisability.email))
			Common.logTestFail("Email Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.TestingAndDisability.desc))
			Common.logTestFail("Service Description Missing");
		System.out.println("Testing and Disability Test Success");
	}

	@Test(priority=8)
	public static void VeteransServices() throws InterruptedException {
		Common.refreshToFirstPage();
		Services.clickVetServices();
		Common.SleepSeconds(2);
		if(!Common.getPageBodySource().contains(ServiceSpecific.VetServices.location))
			Common.logTestFail("Location Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.VetServices.hours))
			Common.logTestFail("Hours Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.VetServices.phoneNum))
			Common.logTestFail("Phone Number Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.VetServices.email))
			Common.logTestFail("Email Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.VetServices.desc))
			Common.logTestFail("Service Description Missing");
		System.out.println("Vet Services Test Success");
	}

	@Test(priority=9)
	public static void TechServices() throws InterruptedException {
		Common.refreshToFirstPage();
		Services.clickTechServices();
		Common.SleepSeconds(2);
		if(!Common.getPageBodySource().contains(ServiceSpecific.TechServices.location))
			Common.logTestFail("Location Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.TechServices.hours))
			Common.logTestFail("Hours Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.TechServices.phoneNum))
			Common.logTestFail("Phone Number Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.TechServices.email))
			Common.logTestFail("Email Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.TechServices.desc))
			Common.logTestFail("Service Description Missing");
		System.out.println("Tech Services Test Success");
	}

	//Page 2
	@Test(priority=10)
	public static void SocSciences() throws InterruptedException {
		Common.refreshToFirstPage();
		Services.clickPage2();
		Services.clickSoSS();
		Common.SleepSeconds(2);
		if(!Common.getPageBodySource().contains(ServiceSpecific.SocSciences.location))
			Common.logTestFail("Location Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.SocSciences.hours))
			Common.logTestFail("Hours Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.SocSciences.phoneNum))
			Common.logTestFail("Phone Number Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.SocSciences.email))
			Common.logTestFail("Email Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.SocSciences.desc))
			Common.logTestFail("Service Description Missing");
		System.out.println("Social Sciences Test Success");
	}

	@Test(priority=11)
	public static void Aces() throws InterruptedException {
		Common.refreshToFirstPage();
		Services.clickPage2();
		Services.clickSchoolOfAces();
		Common.SleepSeconds(2);
		if(!Common.getPageBodySource().contains(ServiceSpecific.Aces.location))
			Common.logTestFail("Location Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.Aces.hours))
			Common.logTestFail("Hours Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.Aces.phoneNum))
			Common.logTestFail("Phone Number Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.Aces.email))
			Common.logTestFail("Email Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.Aces.desc))
			Common.logTestFail("Service Description Missing");
		System.out.println("Aces Test Success");
	}

	@Test(priority=12)
	public static void Nursing() throws InterruptedException {
		Common.refreshToFirstPage();
		Services.clickPage2();
		Services.clickSchoolOfNursing();
		Common.SleepSeconds(2);
		if(!Common.getPageBodySource().contains(ServiceSpecific.Nursing.location))
			Common.logTestFail("Location Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.Nursing.hours))
			Common.logTestFail("Hours Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.Nursing.phoneNum))
			Common.logTestFail("Phone Number Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.Nursing.email))
			Common.logTestFail("Email Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.Nursing.desc))
			Common.logTestFail("Service Description Missing");
		System.out.println("Nursing Test Success");
	}

	@Test(priority=12)
	public static void ArtsAndLetters() throws InterruptedException {
		Common.refreshToFirstPage();
		Services.clickPage2();
		Services.clickSchoolOfArtsAndLetters();
		Common.SleepSeconds(2);
		if(!Common.getPageBodySource().contains(ServiceSpecific.ArtsAndLetters.location))
			Common.logTestFail("Location Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.ArtsAndLetters.hours))
			Common.logTestFail("Hours Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.ArtsAndLetters.phoneNum))
			Common.logTestFail("Phone Number Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.ArtsAndLetters.email))
			Common.logTestFail("Email Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.ArtsAndLetters.desc))
			Common.logTestFail("Service Description Missing");
		System.out.println("Arts and Letters Test Success");
	}

	@Test(priority=14)
	public static void NaturalScience() throws InterruptedException {
		Common.refreshToFirstPage();
		Services.clickPage2();
		Services.clickSchoolOfNaturalScience();
		Common.SleepSeconds(2);
		if(!Common.getPageBodySource().contains(ServiceSpecific.NatScience.location))
			Common.logTestFail("Location Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.NatScience.hours))
			Common.logTestFail("Hours Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.NatScience.phoneNum))
			Common.logTestFail("Phone Number Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.NatScience.email))
			Common.logTestFail("Email Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.NatScience.desc))
			Common.logTestFail("Service Description Missing");
		System.out.println("Natural Sciencee Test Success");
	}

	@Test(priority=15)
	public static void Education() throws InterruptedException {
		Common.refreshToFirstPage();
		Services.clickPage2();
		Services.clickSchoolOfEducation();
		Common.SleepSeconds(2);
		if(!Common.getPageBodySource().contains(ServiceSpecific.Education.location))
			Common.logTestFail("Location Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.Education.hours))
			Common.logTestFail("Hours Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.Education.phoneNum))
			Common.logTestFail("Phone Number Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.Education.email))
			Common.logTestFail("Email Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.Education.desc))
			Common.logTestFail("Service Description Missing");
		System.out.println("Education Test Success");
	}

	@Test(priority=16)
	public static void Business() throws InterruptedException {
		Common.refreshToFirstPage();
		Services.clickPage2();
		Services.clickSchoolOfBusiness();
		Common.SleepSeconds(2);
		if(!Common.getPageBodySource().contains(ServiceSpecific.Business.location))
			Common.logTestFail("Location Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.Business.hours))
			Common.logTestFail("Hours Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.Business.phoneNum))
			Common.logTestFail("Phone Number Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.Business.email))
			Common.logTestFail("Email Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.Business.desc))
			Common.logTestFail("Service Description Missing");
		System.out.println("Business Test Success");
	}

	@Test(priority=17)
	public static void CareerDevCenter() throws InterruptedException {
		Common.refreshToFirstPage();
		Services.clickPage2();
		Services.clickCareerDevCenter();
		Common.SleepSeconds(2);
		if(!Common.getPageBodySource().contains(ServiceSpecific.CareerDevCenter.location))
			Common.logTestFail("Location Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.CareerDevCenter.hours))
			Common.logTestFail("Hours Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.CareerDevCenter.phoneNum))
			Common.logTestFail("Phone Number Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.CareerDevCenter.email))
			Common.logTestFail("Email Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.CareerDevCenter.desc))
			Common.logTestFail("Service Description Missing");
		System.out.println("Career Dev Center Test Success");
	}

	@Test(priority=18)
	public static void Housing() throws InterruptedException {
		Common.refreshToFirstPage();
		Services.clickPage2();
		Services.clickHousing();
		Common.SleepSeconds(2);
		if(!Common.getPageBodySource().contains(ServiceSpecific.Housing.location))
			Common.logTestFail("Location Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.Housing.hours))
			Common.logTestFail("Hours Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.Housing.phoneNum))
			Common.logTestFail("Phone Number Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.Housing.email))
			Common.logTestFail("Email Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.Housing.desc))
			Common.logTestFail("Service Description Missing");
		System.out.println("Housing Test Success");
	}

	//Page 3
	@Test(priority=19)
	public static void Library() throws InterruptedException {
		Common.refreshToFirstPage();
		Services.clickPage3();
		Services.clickLibrary();
		Common.SleepSeconds(2);
		if(!Common.getPageBodySource().contains(ServiceSpecific.Library.location))
			Common.logTestFail("Location Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.Library.hours))
			Common.logTestFail("Hours Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.Library.phoneNum))
			Common.logTestFail("Phone Number Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.Library.email))
			Common.logTestFail("Email Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.Library.desc))
			Common.logTestFail("Service Description Missing");
		System.out.println("Library Test Success");
	}

	@Test(priority=20)
	public static void ConfAndCater() throws InterruptedException {
		Common.refreshToFirstPage();
		Services.clickPage3();
		Services.clickConfAndCatering();
		Common.SleepSeconds(2);
		if(!Common.getPageBodySource().contains(ServiceSpecific.ConfAndCater.location))
			Common.logTestFail("Location Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.ConfAndCater.hours))
			Common.logTestFail("Hours Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.ConfAndCater.phoneNum))
			Common.logTestFail("Phone Number Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.ConfAndCater.email))
			Common.logTestFail("Email Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.ConfAndCater.desc))
			Common.logTestFail("Service Description Missing");
		System.out.println("Conf and Cater Test Success");
	}

	@Test(priority=21)
	public static void CampusLife() throws InterruptedException {
		Common.refreshToFirstPage();
		Services.clickPage3();
		Services.clickCampusLife();
		Common.SleepSeconds(2);
		if(!Common.getPageBodySource().contains(ServiceSpecific.CampusLife.location))
			Common.logTestFail("Location Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.CampusLife.hours))
			Common.logTestFail("Hours Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.CampusLife.phoneNum))
			Common.logTestFail("Phone Number Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.CampusLife.email))
			Common.logTestFail("Email Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.CampusLife.desc))
			Common.logTestFail("Service Description Missing");
		System.out.println("Campus Life Test Success");
	}

	@Test(priority=22)
	public static void FinAid() throws InterruptedException {
		Common.refreshToFirstPage();
		Services.clickPage3();
		Services.clickFinancialAid();
		Common.SleepSeconds(2);
		if(!Common.getPageBodySource().contains(ServiceSpecific.FinAid.location))
			Common.logTestFail("Location Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.FinAid.hours))
			Common.logTestFail("Hours Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.FinAid.phoneNum))
			Common.logTestFail("Phone Number Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.FinAid.email))
			Common.logTestFail("Email Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.FinAid.desc))
			Common.logTestFail("Service Description Missing");
		System.out.println("Financial Aid Test Success");
	}

	@Test(priority=22)
	public static void Bursar() throws InterruptedException {
		Common.refreshToFirstPage();
		Services.clickPage3();
		Services.clickBursar();
		Common.SleepSeconds(2);
		if(!Common.getPageBodySource().contains(ServiceSpecific.Bursar.location))
			Common.logTestFail("Location Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.Bursar.hours))
			Common.logTestFail("Hours Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.Bursar.phoneNum))
			Common.logTestFail("Phone Number Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.Bursar.email))
			Common.logTestFail("Email Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.Bursar.desc))
			Common.logTestFail("Service Description Missing");
		System.out.println("Bursar Test Success");
	}

	@Test(priority=24)
	public static void OgleCenter() throws InterruptedException {
		Common.refreshToFirstPage();
		Services.clickPage3();
		Services.clickOgleCenter();
		Common.SleepSeconds(2);
		if(!Common.getPageBodySource().contains(ServiceSpecific.OgleCenter.location))
			Common.logTestFail("Location Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.OgleCenter.phoneNum))
			Common.logTestFail("Phone Number Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.OgleCenter.email))
			Common.logTestFail("Email Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.OgleCenter.desc))
			Common.logTestFail("Service Description Missing");
		System.out.println("Ogle Center Test Success");
	}

	@Test(priority=25)
	public static void CompScienceTutors() throws InterruptedException {
		Common.refreshToFirstPage();
		Services.clickPage3();
		Services.clickComputerScienceTutors();
		Common.SleepSeconds(2);
		if(!Common.getPageBodySource().contains(ServiceSpecific.CompScienceTutors.location))
			Common.logTestFail("Location Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.CompScienceTutors.hours))
			Common.logTestFail("Hours Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.CompScienceTutors.phoneNum))
			Common.logTestFail("Phone Number Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.CompScienceTutors.email))
			Common.logTestFail("Email Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.CompScienceTutors.desc))
			Common.logTestFail("Service Description Missing");
		System.out.println("Computer Science Tutors Test Success");
	}

	@Test(priority=26)
	public static void SSC() throws InterruptedException {
		Common.refreshToFirstPage();
		Services.clickPage3();
		Services.clickStudentSuccessCenter();
		Common.SleepSeconds(2);
		if(!Common.getPageBodySource().contains(ServiceSpecific.SSC.location))
			Common.logTestFail("Location Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.SSC.hours))
			Common.logTestFail("Hours Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.SSC.phoneNum))
			Common.logTestFail("Phone Number Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.SSC.email))
			Common.logTestFail("Email Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.SSC.desc))
			Common.logTestFail("Service Description Missing");
		System.out.println("SSC Test Success");
	}

	@Test(priority=27)
	public static void MathLab() throws InterruptedException {
		Common.refreshToFirstPage();
		Services.clickPage3();
		Services.clickMathLab();
		Common.SleepSeconds(2);
		if(!Common.getPageBodySource().contains(ServiceSpecific.MathLab.location))
			Common.logTestFail("Location Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.MathLab.hours))
			Common.logTestFail("Hours Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.MathLab.phoneNum))
			Common.logTestFail("Phone Number Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.MathLab.email))
			Common.logTestFail("Email Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.MathLab.desc))
			Common.logTestFail("Service Description Missing");
		System.out.println("Math Lab Test Success");
	}

	//Page 4
	@Test(priority=28)
	public static void WritingCenter() throws InterruptedException {
		Common.refreshToFirstPage();
		Services.clickPage4();
		Services.clickWritingCenter();
		Common.SleepSeconds(2);
		if(!Common.getPageBodySource().contains(ServiceSpecific.WritingCenter.location))
			Common.logTestFail("Location Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.WritingCenter.hours))
			Common.logTestFail("Hours Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.WritingCenter.phoneNum))
			Common.logTestFail("Phone Number Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.WritingCenter.email))
			Common.logTestFail("Email Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.WritingCenter.desc))
			Common.logTestFail("Service Description Missing");
		System.out.println("Writing Center Test Success");
	}

	@Test(priority=29)
	public static void Bookstore() throws InterruptedException {
		Common.refreshToFirstPage();
		Services.clickPage4();
		Services.clickBookstore();
		Common.SleepSeconds(2);
		if(!Common.getPageBodySource().contains(ServiceSpecific.Bookstore.location))
			Common.logTestFail("Location Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.Bookstore.hours))
			Common.logTestFail("Hours Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.Bookstore.phoneNum))
			Common.logTestFail("Phone Number Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.Bookstore.email))
			Common.logTestFail("Email Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.Bookstore.desc))
			Common.logTestFail("Service Description Missing");
		System.out.println("Bookstore Test Success");
	}

	//@Test(priority=20)
	public static void ASC() throws InterruptedException {
		Common.refreshToFirstPage();
		Services.clickPage4();
		Services.clickAdultStudentCenter();
		Common.SleepSeconds(2);
		if(!Common.getPageBodySource().contains(ServiceSpecific.ASC.location))
			Common.logTestFail("Location Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.ASC.hours))
			Common.logTestFail("Hours Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.ASC.phoneNum))
			Common.logTestFail("Phone Number Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.ASC.email))
			Common.logTestFail("Email Missing");
		if(!Common.getPageBodySource().contains(ServiceSpecific.ASC.desc))
			Common.logTestFail("Service Description Missing");
		System.out.println("ASC Test Success");
	}
}
