package renners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xmlx"},
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@Bimser",
        dryRun =false
)

public class Runner {
    /*

        Runner class'i bos bir calss'dir

        bu class'da asil isi

        Class'da kullandigimiz 2 notasyon yapar.

        dryRun = true secildiginde
        Runner istenen featur / scenari'yu calistirmaya degil
        eksik adımlarini bulmaya calisir.

        Eger eksik adim yoksa
        test PASSED der.
        ama bu testin calisip, tum adimlarin gectigini gostermez
        SADECE eksik adim olmadigini gösterir.

        EGER eksik adim bulma amacimiz yoksa
        testlerimizi normal olarak CALISTIRMAK istiyorsak
        dryRun =false secilmelidir.
     */

}
