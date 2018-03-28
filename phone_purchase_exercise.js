const tax = 0.065;
const phonePrice = 199.99;
const accessoryPrice = 5.00;

var bank = 0;
var canSpend = bank/3;
var totalCost = 0;

function getTaxes(amount){
	return amount * tax;
}

function formatAmount(amount){
	return "$" + amount.toFixed(2);
}

function getBank(){
	bank = prompt("how much is in your bank account?");
	return parseInt(bank);
}
//=============================================================

if (bank == 0){
	getBank();
}

while (totalCost < bank){
	totalCost = totalCost + phonePrice;

	if (totalCost < canSpend){
		totalCost = totalCost + accessoryPrice;
	}

	finalCost = totalCost + getTaxes(totalCost);

	if (finalCost > bank) {
		console.log(
			"Your can't afford this purchase of: " + formatAmount(finalCost));
		break;
	}
	console.log("Your Purchse: " + formatAmount(finalCost));
}