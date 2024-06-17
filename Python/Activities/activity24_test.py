import pytest

@pytest.mark.activity
@pytest.mark.parametrize("earned, spent, expected", [ (30, 10, 20), (20, 2, 18), ])
def test_transactions(wallet_amount, earned, spent, expected):
	
    wallet_amount += earned
    print("intial amount", wallet_amount)
 
    wallet_amount -= spent
    print(" total earned amount", wallet_amount)
 
    assert wallet_amount == expected
    print(" amount after spending ", wallet_amount)