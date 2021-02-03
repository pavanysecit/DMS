package runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features="C:/Users/Pavan/workspace/DocumentManagementSystem_Cucumber/features/Inbox_MyClipboard_AllUsecases.feature", glue={"stepDefinition_InboxAndMyClipboard"})
public class Inbox_MyClipboard_runner {

}