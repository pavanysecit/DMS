package runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features="C:/Users/Pavan/workspace/DocumentManagementSystem_Cucumber/features/Administrator_WorkFlow_AllUsecases.feature", glue={"stepDefinition_Administration_WorkFlow"})
public class Administrator_WorkFlow_runner {

}