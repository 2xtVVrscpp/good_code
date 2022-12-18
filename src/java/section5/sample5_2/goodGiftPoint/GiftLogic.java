package section5.sample5_2.goodGiftPoint;

public class GiftLogic {
  void method1() {
    GiftPoint standardMemberShipPoint = GiftPoint.forStandardMembership();
    System.out.println(standardMemberShipPoint);
  }

  void method2() {
    GiftPoint premiumMemberShipPoint = GiftPoint.forPremiumMembership();
    System.out.println(premiumMemberShipPoint);
  }
}
