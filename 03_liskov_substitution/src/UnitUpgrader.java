public class UnitUpgrader {
    public void upgrade(Studio studio) { upgradeSquareFootage(studio); }

    public void upgrade(PenthouseSuite penthouseSuite) {
        upgradeSquareFootage(penthouseSuite);
        penthouseSuite.numberOfBedrooms++;
    }

    public void upgradeSquareFootage(Apartment apartment) { apartment.squareFootage += 40; }
}
