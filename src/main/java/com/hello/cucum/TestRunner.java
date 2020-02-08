package com.hello.cucum;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="target",glue= {"stepdef"})
public class TestRunner {

	
}
