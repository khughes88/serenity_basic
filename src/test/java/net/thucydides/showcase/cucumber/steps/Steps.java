package net.thucydides.showcase.cucumber.steps;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.showcase.cucumber.model.Trade;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;

import java.util.List;
import java.util.Random;


public class Steps {

    List<Trade> trades;

    @Given("I add the following trades to both environments")
    public void i_add_the_following_trades(List<Trade> trades) {
        this.trades = Lists.newArrayList(trades);
	  for(Trade trade : trades ) {
           System.out.println(">>>>>>>>>>>>>>>>>ADDING TRADE" + trade.getName());
        }   
    }

    @Given("I set up the enviroment")
	public void i_set_up_the_enviroment() {
	  
	}

	@Then("all trades are successfully entered")
	public void all_trades_are_successfully_entered() {
	   
	}
    
	@When("I trigger an end of day report")
	public void i_trigger_end_of_day() {
	       
	}

	@Then("^account (\\d+)a has the same position on both environments$")
	public void account_a_has_the_same_position_on_both_environments(int arg1) throws Throwable {
	   System.out.println("CHECKING -> " + arg1 + " on Env1" );
	    System.out.println("CHECKING -> " + arg1 + " on Env2");
	}


    
    
   
    }

