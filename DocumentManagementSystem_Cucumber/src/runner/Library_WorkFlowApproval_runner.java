package runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features="C:/Users/Pavan/workspace/DocumentManagementSystem_Cucumber/features/Library_WorkFlowApproval_AllUsecases.feature", glue={"stepDefinition_LibraryAndWorkFlowProcess"})
public class Library_WorkFlowApproval_runner {

}