package variables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import setup.CommonDriverClass;

public class Services {

    public static WebElement getPage1(){return CommonDriverClass.driver.findElement(By.xpath("/html/body/app-root/body/div/app-home/app-service-list-component/p-table/div/p-paginator/div/span/a[1]"));}
    public static WebElement getPage2(){return CommonDriverClass.driver.findElement(By.xpath("/html/body/app-root/body/div/app-home/app-service-list-component/p-table/div/p-paginator/div/span/a[2]"));}
    public static WebElement getPage3(){return CommonDriverClass.driver.findElement(By.xpath("/html/body/app-root/body/div/app-home/app-service-list-component/p-table/div/p-paginator/div/span/a[3]"));}
    public static WebElement getPage4(){return CommonDriverClass.driver.findElement(By.xpath("/html/body/app-root/body/div/app-home/app-service-list-component/p-table/div/p-paginator/div/span/a[4]"));}

    public static WebElement getBeginningArrow(){return CommonDriverClass.driver.findElement(By.xpath("/html/body/app-root/body/div/app-home/app-service-list-component/p-table/div/p-paginator/div/a[1]/span"));}
    public static WebElement getBackArrow(){return CommonDriverClass.driver.findElement(By.xpath("/html/body/app-root/body/div/app-home/app-service-list-component/p-table/div/p-paginator/div/a[2]/span"));}
    public static WebElement getEndArrow(){return CommonDriverClass.driver.findElement(By.xpath("/html/body/app-root/body/div/app-home/app-service-list-component/p-table/div/p-paginator/div/a[4]/span"));}
    public static WebElement getNextArrow(){return CommonDriverClass.driver.findElement(By.xpath("/html/body/app-root/body/div/app-home/app-service-list-component/p-table/div/p-paginator/div/a[3]/span"));}

    public static WebElement getSearchBar(){return CommonDriverClass.driver.findElement(By.xpath("/html/body/app-root/body/div/app-home/app-service-list-component/p-table/div/div[1]/div/input"));}

    //Page 1
    public static WebElement getIUSPolice(){
        return CommonDriverClass.driver.findElement(By.xpath("/html/body/app-root/body/div/app-home/app-service-list-component/p-table/div/div[2]/table/tbody/tr[1]/td[4]/button"));
    }

    public static WebElement getAthletics(){
        return CommonDriverClass.driver.findElement(By.xpath("/html/body/app-root/body/div/app-home/app-service-list-component/p-table/div/div[2]/table/tbody/tr[2]/td[4]/button"));
    }

    public static WebElement getLanguageLab(){
        return CommonDriverClass.driver.findElement(By.xpath("/html/body/app-root/body/div/app-home/app-service-list-component/p-table/div/div[2]/table/tbody/tr[3]/td[4]/button"));
    }

    public static WebElement getRegistrar(){
        return CommonDriverClass.driver.findElement(By.xpath("/html/body/app-root/body/div/app-home/app-service-list-component/p-table/div/div[2]/table/tbody/tr[4]/td[4]/button"));
    }

    public static WebElement getAdmissions(){
        return CommonDriverClass.driver.findElement(By.xpath("/html/body/app-root/body/div/app-home/app-service-list-component/p-table/div/div[2]/table/tbody/tr[5]/td[4]/button"));
    }

    public static WebElement getAccountingServices(){
        return CommonDriverClass.driver.findElement(By.xpath("/html/body/app-root/body/div/app-home/app-service-list-component/p-table/div/div[2]/table/tbody/tr[6]/td[4]/button"));
    }

    public static WebElement getTestingAndDisability(){
        return CommonDriverClass.driver.findElement(By.xpath("/html/body/app-root/body/div/app-home/app-service-list-component/p-table/div/div[2]/table/tbody/tr[7]/td[4]/button"));
    }

    public static WebElement getVetServices(){
        return CommonDriverClass.driver.findElement(By.xpath("/html/body/app-root/body/div/app-home/app-service-list-component/p-table/div/div[2]/table/tbody/tr[8]/td[4]/button"));
    }

    public static WebElement getTechServices(){
        return CommonDriverClass.driver.findElement(By.xpath("/html/body/app-root/body/div/app-home/app-service-list-component/p-table/div/div[2]/table/tbody/tr[9]/td[4]/button"));
    }

    //Page 2
    public static WebElement getSoSS(){
        return CommonDriverClass.driver.findElement(By.xpath("/html/body/app-root/body/div/app-home/app-service-list-component/p-table/div/div[2]/table/tbody/tr[1]/td[4]/button"));
    }

    public static WebElement getSchoolOfAces(){
        return CommonDriverClass.driver.findElement(By.xpath("/html/body/app-root/body/div/app-home/app-service-list-component/p-table/div/div[2]/table/tbody/tr[2]/td[4]/button"));
    }

    public static WebElement getSchoolOfNursing(){
        return CommonDriverClass.driver.findElement(By.xpath("/html/body/app-root/body/div/app-home/app-service-list-component/p-table/div/div[2]/table/tbody/tr[3]/td[4]/button"));
    }

    public static WebElement getSchoolOfArtsAndLetters(){
        return CommonDriverClass.driver.findElement(By.xpath("/html/body/app-root/body/div/app-home/app-service-list-component/p-table/div/div[2]/table/tbody/tr[4]/td[4]/button"));
    }

    public static WebElement getSchoolOfNaturalScience(){
        return CommonDriverClass.driver.findElement(By.xpath("/html/body/app-root/body/div/app-home/app-service-list-component/p-table/div/div[2]/table/tbody/tr[5]/td[4]/button"));
    }

    public static WebElement getSchoolOfEducation(){
        return CommonDriverClass.driver.findElement(By.xpath("/html/body/app-root/body/div/app-home/app-service-list-component/p-table/div/div[2]/table/tbody/tr[6]/td[4]/button"));
    }

    public static WebElement getSchoolOfBusiness(){
        return CommonDriverClass.driver.findElement(By.xpath("/html/body/app-root/body/div/app-home/app-service-list-component/p-table/div/div[2]/table/tbody/tr[7]/td[4]/button"));
    }

    public static WebElement getCareerDevCenter(){
        return CommonDriverClass.driver.findElement(By.xpath("/html/body/app-root/body/div/app-home/app-service-list-component/p-table/div/div[2]/table/tbody/tr[8]/td[4]/button"));
    }

    public static WebElement getHousing(){
        return CommonDriverClass.driver.findElement(By.xpath("/html/body/app-root/body/div/app-home/app-service-list-component/p-table/div/div[2]/table/tbody/tr[9]/td[4]/button"));
    }

    //Page 3
    public static WebElement getLibrary(){
        return CommonDriverClass.driver.findElement(By.xpath("/html/body/app-root/body/div/app-home/app-service-list-component/p-table/div/div[2]/table/tbody/tr[1]/td[4]/button"));
    }

    public static WebElement getConfAndCatering(){
        return CommonDriverClass.driver.findElement(By.xpath("/html/body/app-root/body/div/app-home/app-service-list-component/p-table/div/div[2]/table/tbody/tr[2]/td[4]/button"));
    }

    public static WebElement getCampusLife(){
        return CommonDriverClass.driver.findElement(By.xpath("/html/body/app-root/body/div/app-home/app-service-list-component/p-table/div/div[2]/table/tbody/tr[3]/td[4]/button"));
    }

    public static WebElement getFinancialAid(){
        return CommonDriverClass.driver.findElement(By.xpath("/html/body/app-root/body/div/app-home/app-service-list-component/p-table/div/div[2]/table/tbody/tr[4]/td[4]/button"));
    }

    public static WebElement getBursar(){
        return CommonDriverClass.driver.findElement(By.xpath("/html/body/app-root/body/div/app-home/app-service-list-component/p-table/div/div[2]/table/tbody/tr[5]/td[4]/button"));
    }

    public static WebElement getOgleCenter(){
        return CommonDriverClass.driver.findElement(By.xpath("/html/body/app-root/body/div/app-home/app-service-list-component/p-table/div/div[2]/table/tbody/tr[6]/td[4]/button"));
    }

    public static WebElement getComputerScienceTutors(){
        return CommonDriverClass.driver.findElement(By.xpath("/html/body/app-root/body/div/app-home/app-service-list-component/p-table/div/div[2]/table/tbody/tr[7]/td[4]/button"));
    }

    public static WebElement getStudentSuccessCenter(){
        return CommonDriverClass.driver.findElement(By.xpath("/html/body/app-root/body/div/app-home/app-service-list-component/p-table/div/div[2]/table/tbody/tr[8]/td[4]/button"));
    }

    public static WebElement getMathLab(){
        return CommonDriverClass.driver.findElement(By.xpath("/html/body/app-root/body/div/app-home/app-service-list-component/p-table/div/div[2]/table/tbody/tr[9]/td[4]/button"));
    }

    //Page 4
    public static WebElement getWritingCenter(){
        return CommonDriverClass.driver.findElement(By.xpath("/html/body/app-root/body/div/app-home/app-service-list-component/p-table/div/div[2]/table/tbody/tr[1]/td[4]/button"));
    }

    public static WebElement getBookstore(){
        return CommonDriverClass.driver.findElement(By.xpath("/html/body/app-root/body/div/app-home/app-service-list-component/p-table/div/div[2]/table/tbody/tr[2]/td[4]/button"));
    }

    public static WebElement getAdultStudentCenter(){
        return CommonDriverClass.driver.findElement(By.xpath("/html/body/app-root/body/div/app-home/app-service-list-component/p-table/div/div[2]/table/tbody/tr[3]/td[4]/button"));
    }
}
