package runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features="C:/Users/Pavan/workspace/DocumentManagementSystem_Cucumber/features/MenuBars_AllUsecases.feature", glue={"stepDeifinition_MenuBars"})
public class MenuBars_runner {

}