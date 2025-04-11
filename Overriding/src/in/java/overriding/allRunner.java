package in.java.overriding;

import in.java.overriding.Bird.internal1.*;
import in.java.overriding.Book.internal20.Book;
import in.java.overriding.Book.internal20.Page;
import in.java.overriding.Cloud.internal2.*;
import in.java.overriding.Knife.internal11.Knife;
import in.java.overriding.Knife.internal11.Veggies;
import in.java.overriding.Locket.internal7.Gold;
import in.java.overriding.Locket.internal7.Locket;
import in.java.overriding.animal.internal14.Animal;
import in.java.overriding.animal.internal14.Carnivor;
import in.java.overriding.cake.internal13.Pastry;
import in.java.overriding.clip.internal5.Clip;
import in.java.overriding.clip.internal5.Plastic;
import in.java.overriding.earpod.internal3.*;
import in.java.overriding.halwa.internal12.Halwa;
import in.java.overriding.halwa.internal12.PineApple;
import in.java.overriding.icecream.internal4.*;
import in.java.overriding.Silver.internal6.*;
import in.java.overriding.laptop.internal17.Asus;
import in.java.overriding.laptop.internal17.Laptop;
import in.java.overriding.mask.internal15.Mask;
import in.java.overriding.mask.internal15.Material;
import in.java.overriding.parachut.internal16.Parachut;
import in.java.overriding.pouch.internal20.Eraser;
import in.java.overriding.pouch.internal20.Pouch;
import in.java.overriding.ring.internal18.Ring;
import in.java.overriding.ring.internal18.Size;
import in.java.overriding.specs.internal8.Brand;
import in.java.overriding.specs.internal8.Specs;
import in.java.overriding.sweetcorn.internal19.Spicy;
import in.java.overriding.sweetcorn.internal19.SweetCorn;
import in.java.overriding.towel.internal9.Towel;
import in.java.overriding.towel.internal9.Turkey;
import in.java.overriding.cake.internal13.*;
import in.java.overriding.parachut.internal16.*;
import in.java.overriding.bag.internal23.*;
import in.java.overriding.beads.internal44.*;
import in.java.overriding.Battery.internal21.*;
import in.java.overriding.jeep.internal99.*;
import in.java.overriding.bottle.internal24.*;
import in.java.overriding.sun.internal26.*;
import in.java.overriding.earring.internal27.*;
import in.java.overriding.bike.internal28.*;
import in.java.overriding.bat.internal93.*;
import in.java.overriding.tree.internal30.*;
import in.java.overriding.bed.internal31.*;
import in.java.overriding.paste.internal32.*;
import in.java.overriding.bulb.internal33.*;
import in.java.overriding.door.internal34.*;
import in.java.overriding.flower.internal35.*;
import in.java.overriding.belt.internal36.*;
import in.java.overriding.bangle.internal37.*;
import in.java.overriding.perfume.internal38.*;
import in.java.overriding.chocolate.internal96.*;
import in.java.overriding.pant.internal40.*;
import in.java.overriding.juice.internal41.*;
import in.java.overriding.umbrella.internal43.*;
import in.java.overriding.charger.internal97.*;
import in.java.overriding.wire.internal45.*;
import in.java.overriding.dosa.internal46.*;
import in.java.overriding.mat.internal47.*;
import in.java.overriding.brush.internal49.*;
import in.java.overriding.tissue.internal48.*;
import in.java.overriding.photo.internal50.*;
import in.java.overriding.gun.internal51.*;
import in.java.overriding.cupboard.internal95.*;
import in.java.overriding.mirror.internal54.*;
import in.java.overriding.hanger.internal55.*;
import in.java.overriding.zip.internal56.*;
import in.java.overriding.Tablet.internal57.*;
import in.java.overriding.toy.internal59.*;
import in.java.overriding.stone.internal60.*;
import in.java.overriding.spoon.internal61.*;
import in.java.overriding.diamond.internal98.*;
import in.java.overriding.cup.internal63.*;
import in.java.overriding.chips.internal64.*;
import in.java.overriding.mic.internal65.*;
import in.java.overriding.radio.internal66.*;
import in.java.overriding.camera.internal67.*;
import in.java.overriding.needle.internal68.*;
import in.java.overriding.scale.internal69.*;
import in.java.overriding.drum.internal70.*;
import in.java.overriding.stick.internal71.*;
import in.java.overriding.file.internal100.*;
import in.java.overriding.table.internal73.*;
import in.java.overriding.seat.internal74.*;
import in.java.overriding.cement.internal75.*;
import in.java.overriding.pizza.internal76.*;
import in.java.overriding.tire.internal77.*;
import in.java.overriding.blazer.internal78.*;
import in.java.overriding.tiles.internal79.*;
import in.java.overriding.usb.internal80.*;
import in.java.overriding.straw.internal81.*;
import in.java.overriding.pipe.internal82.*;
import in.java.overriding.net.internal83.*;
import in.java.overriding.cap.internal94.*;
import in.java.overriding.cab.internal85.*;
import in.java.overriding.helmet.internal86.*;
import in.java.overriding.banner.internal87.*;
import in.java.overriding.keyboard.internal88.*;
import in.java.overriding.guitar.internal89.*;
import in.java.overriding.bracklet.internal90.*;
import in.java.overriding.sward.internal91.*;
import in.java.overriding.panipuri.internal92.*;
import in.java.overriding.Clipboard.internal39.*;



public class allRunner {
    public static void main(String[] args) {

        System.out.println("-----------------------------------------------------------");
        Bulb bulb = new Bulb();
        bulb.glow();
        Bulb bulb1 = new LEDBulb();
        bulb1.glow();
        LEDBulb ledBulb = new LEDBulb();
        ledBulb.glow();
        ledBulb.powerConsumption();

        System.out.println("-----------------------------------------------------------");
        Door door = new Door();
        door.open();

        Door door1 = new SlidingDoor();
        door1.open();

        SlidingDoor slidingDoor = new SlidingDoor();
        slidingDoor.open();
        slidingDoor.lockType();
        System.out.println("-----------------------------------------------------------");
        Flower flower = new Flower();
        flower.smell();

        Flower flower1 = new Rose();
        flower1.smell();

        Rose rose = new Rose();
        rose.smell();
        rose.color();

        System.out.println("-----------------------------------------------------------");
        Belt belt = new Belt();
        belt.hold();

        Belt belt1 = new LeatherBelt();
        belt1.hold();

        LeatherBelt leatherBelt = new LeatherBelt();
        leatherBelt.hold();
        leatherBelt.material();
        System.out.println("-----------------------------------------------------------");

        Charger charger = new Charger();
        charger.charge();

        Charger charger1 = new FastCharger();
        charger1.charge();

        FastCharger fastCharger = new FastCharger();
        fastCharger.charge();
        fastCharger.outputPower();
        System.out.println("-----------------------------------------------------------");
        Umbrella umbrella = new Umbrella();
        umbrella.protect();

        Umbrella umbrella1 = new FoldingUmbrella();
        umbrella1.protect();

        FoldingUmbrella foldingUmbrella = new FoldingUmbrella();
        foldingUmbrella.protect();
        foldingUmbrella.fold();

        System.out.println("-----------------------------------------------------------");

        Juice juice = new Juice();
        juice.drink();

        Juice juice1 = new OrangeJuice();
        juice1.drink();

        OrangeJuice orangeJuice = new OrangeJuice();
        orangeJuice.drink();
        orangeJuice.vitaminCContent();
        System.out.println("-----------------------------------------------------------");
        Pant pant = new Pant();
        pant.wear();

        Pant pant1 = new JeansPant();
        pant1.wear();

        JeansPant jeansPant = new JeansPant();
        jeansPant.wear();
        jeansPant.fabric();

        System.out.println("-----------------------------------------------------------");
        Chocolate chocolate = new Chocolate();
        chocolate.taste();

        Chocolate chocolate1 = new DarkChocolate();
        chocolate1.taste();

        DarkChocolate darkChocolate = new DarkChocolate();
        darkChocolate.taste();
        darkChocolate.cocoaPercentage();
        System.out.println("-----------------------------------------------------------");
        Perfume perfume = new Perfume();
        perfume.fragrance();

        Perfume perfume1 = new FloralPerfume();
        perfume1.fragrance();

        FloralPerfume floralPerfume = new FloralPerfume();
        floralPerfume.fragrance();
        floralPerfume.duration();
        System.out.println("-----------------------------------------------------------");
        Bangle bangle = new Bangle();
        bangle.wear();

        Bangle bangle1 = new GoldBangle();
        bangle1.wear();

        GoldBangle goldBangle = new GoldBangle();
        goldBangle.wear();
        goldBangle.purity();

        System.out.println("-----------------------------------------------------------");

        Bird bird = new Bird();
        bird.color();
        Bird b1 = new Feather();
        b1.color();
        Feather feather = new Feather();
        feather.color();
        feather.category();
        System.out.println("-------------------------------------------------------------");
        Cloud cldy = new Cloud();
        cldy.cloudy();
        Cloud cldy1 = new Rainny();
        cldy1.cloudy();
        Rainny rain = new Rainny();
        rain.cloudy();
        rain.blackCloudy();
        System.out.println("---------------------------------------------------------------");
        Earpod ear1 = new Earpod();
        ear1.price();
        Earpod ear2 = new Color();
        ear2.price();
        Color col = new Color();
        col.price();
        col.brand();
        System.out.println("-----------------------------------------------------------");
        IceCream ice1 = new IceCream();
        ice1.flavour();
        IceCream ice2 = new Vannila();
        ice2.flavour();
        Vannila vannila = new Vannila();
        vannila.flavour();
        vannila.pista();
        System.out.println("-----------------------------------------------------------");
        Clip clip1 = new Clip();
        clip1.Material();
        Clip cl = new Plastic();
        cl.Material();
        Plastic pl = new Plastic();
        pl.Material();
        pl.clipType();
        System.out.println("-----------------------------------------------------------");
        Locket locket1 = new Locket();
        locket1.chain();
        Locket locket2 = new Gold();
        locket2.chain();
        Gold gold = new Gold();
        gold.shape();
        System.out.println("-----------------------------------------------------------");
        Silver silver = new Silver();
        silver.coin();
        Silver silver1 = new Plate();
        silver.coin();
        Plate plate = new Plate();
        plate.coin();
        plate.glass();
        System.out.println("-----------------------------------------------------------");
        Specs sp = new Specs();
        sp.frame();
        Specs sp1 = new Brand();
        sp1.frame();
        Brand brand = new Brand();
        brand.frame();
        brand.black();
        System.out.println("-----------------------------------------------------------");
        Towel towel1 = new Towel();
        towel1.cloth();
        Towel towel2 = new Turkey();
        towel2.cloth();
        Turkey turkey = new Turkey();
        turkey.cloth();
        turkey.cotton();
        System.out.println("-----------------------------------------------------------");
        Knife knife1 = new Knife();
        knife1.cut();
        Knife knife2 = new Veggies();
        knife2.cut();
        Veggies veg = new Veggies();
        veg.fruit();
        System.out.println("-----------------------------------------------------------");
        Halwa halwa = new Halwa();
        halwa.sweet();
        Halwa halwa1 = new PineApple();
        halwa1.sweet();
        PineApple pineApple = new PineApple();
        pineApple.sweet();
        pineApple.piece();
        System.out.println("-----------------------------------------------------------");
        Cake cake1 = new Cake();
        Cake cake2 = new Pastry();
        Pastry pastry = new Pastry();
        System.out.println("-----------------------------------------------------------");
        Animal animal = new Animal();
        animal.domestic();
        Animal animal1 = new Carnivor();
        animal1.domestic();
        Carnivor carnivor = new Carnivor();
        carnivor.domestic();
        carnivor.tiger();
        System.out.println("-----------------------------------------------------------");
        Mask mask1 = new Mask();
        mask1.mask();
        Mask mask2 = new Material();
        mask2.mask();
        Material material = new Material();
        material.mask();
        material.color();

        System.out.println("-----------------------------------------------------------");
        Parachut parachut1 = new Parachut();
        Parachut parachut2 = new Air();
        Air air1 = new Air();

        System.out.println("-----------------------------------------------------------");
        Laptop laptop = new Laptop();
        laptop.brand();
        Laptop laptop1 = new Asus();
        laptop1.brand();
        Asus asus = new Asus();
        asus.brand();
        asus.color();
        System.out.println("-----------------------------------------------------------");
        Ring ring = new Ring();
        ring.silver();
        Ring ring1 = new Size();
        ring1.silver();
        Size size = new Size();
        size.silver();
        size.anklet();
        System.out.println("-----------------------------------------------------------");
        SweetCorn sweetCorn = new SweetCorn();
        sweetCorn.salt();
        SweetCorn sweetCorn1 = new Spicy();
        sweetCorn1.salt();
        Spicy spicy = new Spicy();
        spicy.butterCorn();
        spicy.salt();

        System.out.println("-----------------------------------------------------------");
        Pouch pouch = new Pouch();
        pouch.pencil();
        Pouch pouch1 = new Eraser();
        pouch1.pencil();
        Eraser eraser = new Eraser();
        eraser.apsara();

        System.out.println("-----------------------------------------------------------");
        Book book = new Book();
        book.classmates();
        Book book1 = new Page();
        book1.classmates();
        Page page = new Page();
        page.classmates();
        page.ruled();
        System.out.println("-----------------------------------------------------------");
        Battery battery = new Battery();
        battery.type();

        Battery battery1 = new Exide();
        battery1.type();
        Exide exide = new Exide();
        exide.type();
        exide.capacity();
        System.out.println("-----------------------------------------------------------");
        Jeep jeep = new Jeep();
        jeep.model();
        Jeep jeep1 = new Thar();
        jeep1.model();
        Thar thar = new Thar();
        thar.model();
        thar.color();

        System.out.println("-----------------------------------------------------------");
        Bag bag = new Bag();
        bag.type();
        Bag bag1 = new SchoolBag();
        bag1.type();
        SchoolBag schoolBag = new SchoolBag();
        schoolBag.type();
        schoolBag.capacity();
        System.out.println("-----------------------------------------------------------");
        Bottle bottle = new Bottle();
        bottle.material();

        Bottle bottle1 = new WaterBottle();
        bottle1.material();

        WaterBottle waterBottle = new WaterBottle();
        waterBottle.material();
        waterBottle.capacity();

        System.out.println("-----------------------------------------------------------");
        Sun sun = new Sun();
        sun.shine();

        Sun sun1 = new RisingSun();
        sun1.shine();

        RisingSun risingSun = new RisingSun();
        risingSun.shine();
        risingSun.direction();

        System.out.println("-----------------------------------------------------------");
        Earring earring = new Earring();
        earring.design();

        Earring earring1 = new GoldEarring();
        earring1.design();

        GoldEarring goldEarring = new GoldEarring();
        goldEarring.design();
        goldEarring.price();

        System.out.println("-----------------------------------------------------------");
        Bike bike = new Bike();
        bike.speed();

        Bike bike1 = new SportsBike();
        bike1.speed();

        SportsBike sportsBike = new SportsBike();
        sportsBike.speed();
        sportsBike.engine();

        System.out.println("-----------------------------------------------------------");
        Bat bat = new Bat();
        bat.type();

        Bat bat1 = new CricketBat();
        bat1.type();

        CricketBat cricketBat = new CricketBat();
        cricketBat.type();
        cricketBat.weight();


        System.out.println("-----------------------------------------------------------");
        Tree tree = new Tree();
        tree.grow();

        Tree tree1 = new MangoTree();
        tree1.grow();

        MangoTree mangoTree = new MangoTree();
        mangoTree.grow();
        mangoTree.fruit();


        System.out.println("-----------------------------------------------------------");
        Bed bed = new Bed();
        bed.comfort();

        Bed bed1 = new KingSizeBed();
        bed1.comfort();

        KingSizeBed kingSizeBed = new KingSizeBed();
        kingSizeBed.comfort();
        kingSizeBed.size();
        System.out.println("-----------------------------------------------------------");


        Paste paste = new Paste();
        paste.use();

        Paste paste1 = new ToothPaste();
        paste1.use();

        ToothPaste toothPaste = new ToothPaste();
        toothPaste.use();
        toothPaste.flavor();
        System.out.println("-----------------------------------------------------------");
        Wire wire = new Wire();
        wire.transmit();

        Wire wire1 = new CopperWire();
        wire1.transmit();

        CopperWire copperWire = new CopperWire();
        copperWire.transmit();
        copperWire.conductivity();
        System.out.println("-----------------------------------------------------------");


        System.out.println("-----------------------------------------------------------");

        Dosa dosa = new Dosa();
        dosa.prepare();

        Dosa dosa1 = new MasalaDosa();
        dosa1.prepare();

        MasalaDosa masalaDosa = new MasalaDosa();
        masalaDosa.prepare();
        masalaDosa.stuffing();

        System.out.println("-----------------------------------------------------------");


        Brush brush = new Brush();
        brush.clean();

        Brush brush1 = new PaintBrush();
        brush1.clean();

        PaintBrush paintBrush = new PaintBrush();
        paintBrush.clean();
        paintBrush.paint();


        System.out.println("-----------------------------------------------------------");

        Mat mat = new Mat();
        mat.use();

        Mat mat1 = new YogaMat();
        mat1.use();

        YogaMat yogaMat = new YogaMat();
        yogaMat.use();
        yogaMat.thickness();

        System.out.println("-----------------------------------------------------------");
        Tissue tissue = new Tissue();
        tissue.use();

        Tissue tissue1 = new WetTissue();
        tissue1.use();

        WetTissue wetTissue = new WetTissue();
        wetTissue.use();
        wetTissue.fragrance();

        System.out.println("-----------------------------------------------------------");

        Gun gun = new Gun();
        gun.shoot();

        Gun gun1 = new Pistol();
        gun1.shoot();

        Pistol pistol = new Pistol();
        pistol.shoot();
        pistol.reload();

        System.out.println("-----------------------------------------------------------");

        Photo photo = new Photo();
        photo.capture();

        Photo photo1 = new DigitalPhoto();
        photo1.capture();

        DigitalPhoto digitalPhoto = new DigitalPhoto();
        digitalPhoto.capture();
        digitalPhoto.resolution();

        System.out.println("-----------------------------------------------------------");
        Cupboard cupboard = new Cupboard();
        cupboard.open();

        Cupboard cupboard1 = new WoodenCupboard();
        cupboard1.open();

        WoodenCupboard woodenCupboard = new WoodenCupboard();
        woodenCupboard.open();
        woodenCupboard.polish();

        System.out.println("-----------------------------------------------------------");

        Mirror mirror = new Mirror();
        mirror.reflect();

        Mirror mirror1 = new WallMirror();
        mirror1.reflect();

        WallMirror wallMirror = new WallMirror();
        wallMirror.reflect();
        wallMirror.hang();

        System.out.println("-----------------------------------------------------------");

        Hanger hanger = new Hanger();
        hanger.hold();

        Hanger hanger1 = new ClothHanger();
        hanger1.hold();

        ClothHanger clothHanger = new ClothHanger();
        clothHanger.hold();
        clothHanger.rotate();
        System.out.println("-----------------------------------------------------------");

        Zip zip = new Zip();
        zip.close();

        Zip zip1 = new MetalZip();
        zip1.close();

        MetalZip metalZip = new MetalZip();
        metalZip.close();
        metalZip.strength();

        Tablet tablet = new Tablet();
        tablet.powerOn();

        Tablet tablet1 = new AndroidTablet();
        tablet1.powerOn();

        AndroidTablet androidTablet = new AndroidTablet();
        androidTablet.powerOn();
        androidTablet.installApp();


        System.out.println("-----------------------------------------------------------");
        Toy toy = new Toy();
        toy.play();

        Toy toy1 = new Doll();
        toy1.play();

        Doll doll = new Doll();
        doll.play();
        doll.price();


        System.out.println("-----------------------------------------------------------");
        Stone stone = new Stone();
        stone.weight();

        Stone stone1 = new GraniteStone();
        stone1.weight();

        GraniteStone granite = new GraniteStone();
        granite.weight();
        granite.polish();


        System.out.println("-----------------------------------------------------------");

        Spoon spoon = new Spoon();
        spoon.use();

        Spoon spoon1 = new SteelSpoon();
        spoon1.use();

        SteelSpoon steelSpoon = new SteelSpoon();
        steelSpoon.use();
        steelSpoon.shine();

        System.out.println("-----------------------------------------------------------");
        Diamond diamond = new Diamond();
        diamond.shine();

        Diamond diamond1 = new CutDiamond();
        diamond1.shine();

        CutDiamond cutDiamond = new CutDiamond();
        cutDiamond.shine();
        cutDiamond.sparkle();

        System.out.println("-----------------------------------------------------------");
        Cup cup = new Cup();
        cup.fill();

        Cup cup1 = new TeaCup();
        cup1.fill();

        TeaCup teaCup = new TeaCup();
        teaCup.fill();
        teaCup.sip();


        System.out.println("-----------------------------------------------------------");

        Chips chips = new Chips();
        chips.taste();

        Chips chips1 = new PotatoChips();
        chips1.taste();

        PotatoChips potatoChips = new PotatoChips();
        potatoChips.taste();
        potatoChips.crunch();


        System.out.println("-----------------------------------------------------------");

        Mic mic = new Mic();
        mic.record();

        Mic mic1 = new WirelessMic();
        mic1.record();

        WirelessMic wirelessMic = new WirelessMic();
        wirelessMic.record();
        wirelessMic.connect();


        System.out.println("-----------------------------------------------------------");

        Radio radio = new Radio();
        radio.play();

        Radio radio1 = new FMRadio();
        radio1.play();

        FMRadio fmRadio = new FMRadio();
        fmRadio.play();
        fmRadio.tune();


        System.out.println("-----------------------------------------------------------");

        Camera camera = new Camera();
        camera.capture();

        Camera camera1 = new DigitalCamera();
        camera1.capture();

        DigitalCamera digitalCamera = new DigitalCamera();
        digitalCamera.capture();
        digitalCamera.zoom();

        System.out.println("-----------------------------------------------------------");
        Needle needle = new Needle();
        needle.pierce();

        Needle needle1 = new SewingNeedle();
        needle1.pierce();

        SewingNeedle sewingNeedle = new SewingNeedle();
        sewingNeedle.pierce();
        sewingNeedle.stitch();

        System.out.println("-----------------------------------------------------------");

        Scale scale = new Scale();
        scale.measure();

        Scale scale1 = new MeasuringScale();
        scale1.measure();

        MeasuringScale measuringScale = new MeasuringScale();
        measuringScale.measure();
        measuringScale.calibrate();

        System.out.println("-----------------------------------------------------------");

        Stick stick = new Stick();
        stick.hold();

        Stick stick1 = new WoodenStick();
        stick1.hold();

        WoodenStick woodenStick = new WoodenStick();
        woodenStick.hold();
        woodenStick.swing();
        System.out.println("-----------------------------------------------------------");

        Drum drum = new Drum();
        drum.beat();

        Drum drum1 = new BassDrum();
        drum1.beat();

        BassDrum bassDrum = new BassDrum();
        bassDrum.beat();
        bassDrum.echo();


        System.out.println("-----------------------------------------------------------");

        File file = new File();
        file.open();

        File file1 = new PDFFile();
        file1.open();

        PDFFile pdfFile = new PDFFile();
        pdfFile.open();
        pdfFile.read();

        System.out.println("-----------------------------------------------------------");

        Table table = new Table();
        table.support();

        Table table1 = new DiningTable();
        table1.support();

        DiningTable diningTable = new DiningTable();
        diningTable.support();
        diningTable.serveFood();
        System.out.println("-----------------------------------------------------------");
        Seat seat = new Seat();
        seat.sit();

        Seat seat1 = new WindowSeat();
        seat1.sit();

        WindowSeat windowSeat = new WindowSeat();
        windowSeat.sit();
        windowSeat.view();
        System.out.println("-----------------------------------------------------------");
        Cement cement = new Cement();
        cement.mix();

        Cement cement1 = new WhiteCement();
        cement1.mix();

        WhiteCement whiteCement = new WhiteCement();
        whiteCement.mix();
        whiteCement.shine();
        System.out.println("-----------------------------------------------------------");

        Pizza pizza = new Pizza();
        pizza.bake();

        Pizza pizza1 = new CheesePizza();
        pizza1.bake();

        CheesePizza cheesePizza = new CheesePizza();
        cheesePizza.bake();
        cheesePizza.addCheese();
        System.out.println("-----------------------------------------------------------");

        Tire tire = new Tire();
        tire.rotate();

        Tire tire1 = new TubelessTire();
        tire1.rotate();

        TubelessTire tubelessTire = new TubelessTire();
        tubelessTire.rotate();
        tubelessTire.sealPuncture();

        System.out.println("-----------------------------------------------------------");

        Blazer blazer = new Blazer();
        blazer.wear();

        Blazer blazer1 = new FormalBlazer();
        blazer1.wear();

        FormalBlazer formalBlazer = new FormalBlazer();
        formalBlazer.wear();
        formalBlazer.matchWithTie();

        System.out.println("-----------------------------------------------------------");

        Tiles tiles = new Tiles();
        tiles.place();

        Tiles tiles1 = new CeramicTiles();
        tiles1.place();

        CeramicTiles ceramicTiles = new CeramicTiles();
        ceramicTiles.place();
        ceramicTiles.polish();
        System.out.println("-----------------------------------------------------------");
        USB usb = new USB();
        usb.connect();

        USB usb1 = new USB3();
        usb1.connect();

        USB3 usb3 = new USB3();
        usb3.connect();
        usb3.fastTransfer();
        System.out.println("-----------------------------------------------------------");
        Straw straw = new Straw();
        straw.use();

        Straw straw1 = new PlasticStraw();
        straw1.use();

        PlasticStraw plasticStraw = new PlasticStraw();
        plasticStraw.use();
        plasticStraw.recycle();

        System.out.println("-----------------------------------------------------------");

        Pipe pipe = new Pipe();
        pipe.carry();

        Pipe pipe1 = new PVCpipe();
        pipe1.carry();

        PVCpipe pvcpipe = new PVCpipe();
        pvcpipe.carry();
        pvcpipe.bend();
        System.out.println("-----------------------------------------------------------");
        Net net = new Net();
        net.trap();

        Net net1 = new FishingNet();
        net1.trap();

        FishingNet fishingNet = new FishingNet();
        fishingNet.trap();
        fishingNet.throwNet();
        System.out.println("-----------------------------------------------------------");

        Helmet helmet = new Helmet();
        helmet.protect();

        Helmet helmet1 = new RacingHelmet();
        helmet1.protect();

        RacingHelmet racingHelmet = new RacingHelmet();
        racingHelmet.protect();
        racingHelmet.adjustVisor();
        System.out.println("-----------------------------------------------------------");
        Cab cab = new Cab();
        cab.ride();

        Cab cab1 = new OlaCab();
        cab1.ride();

        OlaCab ola = new OlaCab();
        ola.ride();
        ola.book();
        System.out.println("-----------------------------------------------------------");

        Cap cap = new Cap();
        cap.wear();

        Cap cap1 = new SportsCap();
        cap1.wear();

        SportsCap sportsCap = new SportsCap();
        sportsCap.wear();
        sportsCap.adjustStrap();

        System.out.println("-----------------------------------------------------------");

        Banner banner = new Banner();
        banner.display();

        Banner banner1 = new DigitalBanner();
        banner1.display();

        DigitalBanner digitalBanner = new DigitalBanner();
        digitalBanner.display();
        digitalBanner.animate();
        System.out.println("-----------------------------------------------------------");
        Keyboard keyboard = new Keyboard();
        keyboard.type();

        Keyboard keyboard1 = new MechanicalKeyboard();
        keyboard1.type();

        MechanicalKeyboard mechanicalKeyboard = new MechanicalKeyboard();
        mechanicalKeyboard.type();
        mechanicalKeyboard.backlight();

        System.out.println("-----------------------------------------------------------");
        Guitar guitar = new Guitar();
        guitar.play();

        Guitar guitar1 = new ElectricGuitar();
        guitar1.play();

        ElectricGuitar electricGuitar = new ElectricGuitar();
        electricGuitar.play();
        electricGuitar.plugIn();
        System.out.println("-----------------------------------------------------------");
        Braklet braklet = new Braklet();
        braklet.wear();

        Braklet braklet1 = new GoldBraklet();
        braklet1.wear();

        GoldBraklet goldBraklet = new GoldBraklet();
        goldBraklet.wear();
        goldBraklet.shine();
        System.out.println("-----------------------------------------------------------");
        Sward sward = new Sward();
        sward.attack();

        Sward sward1 = new SteelSward();
        sward1.attack();

        SteelSward steelSward = new SteelSward();
        steelSward.attack();
        steelSward.sharpen();

        System.out.println("-----------------------------------------------------------");
        Panipuri panipuri = new Panipuri();
        panipuri.serve();

        Panipuri panipuri1 = new SpicyPanipuri();
        panipuri1.serve();

        SpicyPanipuri spicyPanipuri = new SpicyPanipuri();
        spicyPanipuri.serve();
        spicyPanipuri.addExtraSpice();

        System.out.println("-----------------------------------------------------------");

        Beads beads = new Beads();
        beads.decorate();

        Beads beads1 = new ColorBeads();
        beads1.decorate();

        ColorBeads colorBeads = new ColorBeads();
        colorBeads.decorate();
        colorBeads.sortByColor();

        System.out.println("-----------------------------------------------------------");

        Clipboard clipboard = new Clipboard();
        clipboard.hold();

        Clipboard clipboard1 = new DigitalClipboard();
        clipboard1.hold();

        DigitalClipboard digitalClipboard = new DigitalClipboard();
        digitalClipboard.hold();
        digitalClipboard.copyText();

        System.out.println("-----------------------------------------------------------");
        System.out.println("-----------------------------------------------------------");
        System.out.println("-----------------------------------------------------------");
        System.out.println("-----------------------------------------------------------");
        System.out.println("-----------------------------------------------------------");
        System.out.println("-----------------------------------------------------------");


    }
}




