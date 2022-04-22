package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /* Exercise 1
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */
		// ### EXAMPLE:
		int birdsOnABranch = 4;
		int birdsThatFlyAway = 1;
		int birdsRemaining = birdsOnABranch - birdsThatFlyAway;

        /* Exercise 2
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */
		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;

        /* Exercise 3
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
    	int raccoonsInWoods = 3;
		int raccoonsGoingHome = 2;
		int raccoonsLeftInWoods = raccoonsInWoods - raccoonsGoingHome;

        /* Exercise 4
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
		int flowers = 5;
		int bees = 3;
		int lessBeesThanFlowers = flowers - bees;

        /* Exercise 5
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
		int lonelyPigeon = 1;
		int anotherPigeon = 1;
		int eatingPigeons = lonelyPigeon + anotherPigeon;


        /* Exercise 6
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
		int sittingOwls = 3;
		int joiningOwls = 2;
		int owlsOnFence = sittingOwls + joiningOwls;

        /* Exercise 7
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
		int workingBeavers = 2;
		int swimmingBeavers = 1;
		int beaversStillWorking = workingBeavers - swimmingBeavers;

        /* Exercise 8
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
		int sittingToucans = 2;
		int joiningToucans = 1;
		int totalToucans = sittingToucans + joiningToucans;

        /* Exercise 9
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		int squirrelsInTree = 4;
		int nuts = 2;
		int moreSquirrelsThanNuts = squirrelsInTree - nuts;

        /* Exercise 10
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
		double quarter = 0.25;
		double dime = 0.10;
		double nickels = 0.10;
		double mrsHiltFoundMoney = quarter + dime + nickels;

        /* Exercise 11
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
		int briersClassMuffins = 18;
		int macAdamsClassMuffins = 20;
		int flannerysClassMuffins = 17;
		int firstGradeMuffins = briersClassMuffins + macAdamsClassMuffins + flannerysClassMuffins;

        /* Exercise 12
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		double yoyo = 0.24;
		double whistle = 0.14;
		double mrsHiltToysCost = yoyo + whistle;


        /* Exercise 13
        13. Mrs. Hilt made 5 Rice Krispies Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
		int hiltRiceKrispies = 5;
		int hiltLargeMarshmallows = 8;
		int hiltMiniMarshmallows = 10;
		int hiltTotalMarshmallowsUsed = hiltLargeMarshmallows + hiltMiniMarshmallows;


        /* Exercise 14
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		int hiltsSnowInches = 29;
		int brecknockSnowInches = 17;
		int hiltsMoreInchesOfSnow = hiltsSnowInches - brecknockSnowInches;

        /* Exercise 15
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
		double hiltsDollars = 10;
		double toyTruck = 3;
		double pencilCase = 2;
		double hiltsMoneyLeftOver = hiltsDollars - toyTruck - pencilCase;

        /* Exercise 16
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
		int joshMarbleCollection = 16;
		int lostMarbles = 7;
		int joshMarblesLeft = joshMarbleCollection - lostMarbles;

        /* Exercise 17
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		int meganSeashells = 19;
		int findableSeashells = 6;
		int seashellsToFind = findableSeashells;

        /* Exercise 18
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
		int bradBalloons = 17;
		int bradRedBalloons = 8;
		int otherBalloons = 9;
		int bradGreenBalloons = otherBalloons;

        /* Exercise 19
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
		int booksOnShelf = 38;
		int addedBooks = 10;
		int totalBooks = booksOnShelf + addedBooks;

        /* Exercise 20
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
		int beeLegs = 6;
		int eightBeesLegs = beeLegs * 8;


        /* Exercise 21
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
		double hiltsIcecream = 0.99;
		double twoIcecreams = hiltsIcecream * 2;

        /* Exercise 22
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
		int hiltsRocks = 64;
		int neededRocks = 125;
		int rocksToFindForCompletion = neededRocks - hiltsRocks;

        /* Exercise 23
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
		int hiltsMarbles = 38;
		int hiltsLostMarbles = 15;
		int hiltsMarblesLeft = hiltsMarbles - hiltsLostMarbles;

        /* Exercise 24
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
		int destinationMiles = 78;
		int droveMiles = 32;
		int milesLeft = destinationMiles - droveMiles;


        /* Exercise 25
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time (in minutes) did she spend shoveling snow?
        */
		int timeSpentShovelingSaturdayMorning = 90;
		int timeSpentShovelingSaturdayAfternoon = 45;
		int totalTimeShoveling = timeSpentShovelingSaturdayMorning + timeSpentShovelingSaturdayAfternoon;

        /* Exercise 26
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
		double hotdogs = 0.50;
		double hiltSpentMoneyOnHotdogs = hotdogs * 6;

        /* Exercise 27
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
		double mrsHiltCents = 0.50;
		double pencilCost = 0.07;
		double howManyPencilsCanHiltBuy = mrsHiltCents / pencilCost;

			/* Exercise 28
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
		int seenButterflies = 33;
		int orangeButterflies = 20;
		int redButterflies = seenButterflies - orangeButterflies;

        /* Exercise 29
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
		double katesDollars = 1.00;
		double candyCost = 0.54;
		double changeBack = katesDollars - candyCost;

        /* Exercise 30
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
		int markBackyardTrees = 13;
		int plantedTrees = 12;
		int totalTrees = markBackyardTrees + plantedTrees;

        /* Exercise 31
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
		int joyGrandmaVisit = 48;
		int currentHour = 0;
		int hoursUntilVisit = currentHour + joyGrandmaVisit;


        /* Exercise 32
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
		int kimsCousins = 4;
		int gum = 5;
		int gumNeeded = gum * kimsCousins;

        /* Exercise 33
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
		double dansDollars = 3.00;
		double candyBarCost = 1.00;
		double moneyLeft = dansDollars - candyBarCost;

        /* Exercise 34
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
		int boatsInLake = 5;
		int peopleOnEachBoat = 3;
		int peoplesOnBoatsInTheLake = peopleOnEachBoat * boatsInLake;


        /* Exercise 35
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
		int ellenLegos = 380;
		int ellenLostLegos = 57;
		int ellenLegosLeft = ellenLegos - ellenLostLegos;

        /* Exercise 36
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
		int arthurBakedMuffins = 35;
		int desiredMuffinsBaked = 83;
		int muffinsNeededToBeBakeForDesiredAmount = desiredMuffinsBaked - arthurBakedMuffins;

        /* Exercise 37
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
		int willyCrayons = 1400;
		int lucyCrayons = 290;
		int howMuchCrayonsWillyHasThanLucy = willyCrayons - lucyCrayons;


        /* Exercise 38
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
		int stickersOnEachPage = 10;
		int myPages = 22;
		int numberOfStickersIHave = stickersOnEachPage * myPages;


        /* Exercise 39
        39. There are 100 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
		double numberOfCupcakes = 100.0;
		double numberOfChildren = 8.0;
		double equallySharedCupcakes = numberOfCupcakes / numberOfChildren;

        /* Exercise 40
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies, how many
        cookies will not be placed in a jar?
        */
		int madeGingerbreadCookies = 47;
		int cookiesJarCanContain = 6;
		int cookiesLeftOutOfJar = madeGingerbreadCookies % cookiesJarCanContain;

        /* Exercise 41
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received an equal number of croissants,
        how many will be left with Marian?
        */
		int preparedCroissants = 59;
		int numberOfNeighbors = 8;
		int leftoverCroissantsAfterEquallySharingWithNeighbors = preparedCroissants % numberOfNeighbors;


        /* Exercise 42
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
		int cookiesHeldOnEachTray = 12;
		int desiredPreparedOatmealCookies = 276;
		int traysNeededToPrepareDesiredCookieAmount = desiredPreparedOatmealCookies / cookiesHeldOnEachTray;

        /* Exercise 43
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
		int mariansBiteSizedPretzels = 480;
		int oneServingOfBiteSizedPretzelsToWholePretzels = 12;
		int howManyServingsOfBiteSizedPretzelsPrepared = oneServingOfBiteSizedPretzelsToWholePretzels / mariansBiteSizedPretzels;


        /* Exercise 44
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
		int bakedLemonCupcakes = 51;
		int lemonCupcakesLeftAtHome = 2;
		int boxesWithThreeLemonCupakes = 3;
		int givenAwayLemonCupcakeBoxes = bakedLemonCupcakes / boxesWithThreeLemonCupakes;



        /* Exercise 45
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
		int preparedCarrotSticks = 74;
		int equallyServedPeople = 12;
		int carrotSticksLeftUneaten = preparedCarrotSticks % equallyServedPeople;


        /* Exercise 46
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
		int gatheredTeddyBears = 98;
		int shelfMaxCarry = 7;
		int filledShelves = gatheredTeddyBears / shelfMaxCarry;


        /* Exercise 47
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
		int picturesContainedInAlbum = 20;
		int picture = 480;
		int neededAlbums = picture / picturesContainedInAlbum;

        /* Exercise 48
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
		int joeTradingCards = 94;
		int fullBoxOfCards = 8;
		int filledBoxes = joeTradingCards / fullBoxOfCards;
		int unfilledBoxes = joeTradingCards % fullBoxOfCards;

        /* Exercise 49
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
		int booksDistributedEqually = 210;
		int repairedShelves = 10;
		int maxShelfContain = booksDistributedEqually / repairedShelves;

        /* Exercise 50
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
		double bakedCroissants = 17.0;
		double guest = 7.0;
		double equallyServedCroissants = bakedCroissants / guest;

	    /* Exercise 51
	    51. Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
	    1.90 hours. How long will it take the two painters working together to paint 5 12 x 14 rooms?
	    Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
	    */
		double roomSize = 166.56;
		double billPaintTimeHours = 2.15;
		double jillPaintTimeHours = 1.90;
		double combinedHours = 4.05;
		double fiveRoomSizes = 840;
		double hoursToPaint5roomsForJillAndBill = fiveRoomSizes / roomSize;


	    /* Exercise 52
	    52. Create and assign variables to hold a first name, last name, and middle initial. Using concatenation,
		build an additional variable to hold the full name in the order of last name, first name, middle initial. The
		last and first names should be separated by a comma followed by a space, and the middle initial must end
		with a period. Use "Grace", "Hopper, and "B" for the first name, last name, and middle initial.
		Example: "John", "Smith, "D" —> "Smith, John D."
	    */
		String firstName = "Grace";
		String lastName = "Hopper";
		String middleInitial = "B";
		String fullName = "Hopper" + "," + " Grace" + " B" + ".";

	    /* Exercise 53
	    53. The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
	    What percentage of the trip as a whole number has been completed?
	    */
		int newYorkAndChicagoCombinedMiles = 800;
		int trainMilesTravelled = 537;
		int percentageOfTripCompleted = trainMilesTravelled / newYorkAndChicagoCombinedMiles * 100;
	}

}
