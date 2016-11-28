
/*
    ABI =  Ability Score Increase
    Age = Selected age int
    Adult = Age in which race is considered an adult int
    Lifespan = How long the race typically lives int
    Alignment = Average moral compass of race String
    Size = Average size double
    Speed = How fast the race usually walks int
    Special = Special abilites of the race String[]
    Subrace = Subrace... String
    Names (note the plural) = Common names of the race String
    Family/Clan = Family/Clan name of the character String
    
    strn = Strength - Natural Athleticism and body power (best for Fighter)
    dxtr = Dexterity - Physical agility, reflexes, balance, poise (best for Rogue)
    cons = Constitution - Health, stamina, vital force (best for Everyone)
    intl = Intelligence - Mental acuity, information recall, analytical skill (best for Wizard)
    wsdm = Wisdom - Awareness, intuition, insight (best for Cleric)
    chrm = Charisma - Confidence, eloquence, leadership (best for Leaders or diplomatic characters)    
    */
public class DnDFunction extends DnDMain
{
    /**
     * Constructor for objects of class DnDFunction
     */
    public DnDFunction(){
        
    }
    
    Character getCharacter() {
        return new Character();
    }
    
    public class Character {
        public int strn, dxtr, cons, intl, wsdm, chrm, speed, age;
        public double size;
        public boolean adult;
        public String Name = "", ClanOrFamily = "";
        
        public void Character(int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
            this.strn = assign(strength);
            this.dxtr = assign(dexterity);
            this.cons = assign(constitution);
            this.intl = assign(intelligence);
            this.wsdm = assign(wisdom);
            this.chrm = assign(charisma);
            this.speed = 0;
            this.age = 200;
            this.size = 5.5;
            this.RaceElf();
            this.Name = "Etwahl";
            this.ClanOrFamily = "Son of Lumiere";
        }
        
        private int assign(int point) {
            int result = 0;
            if (point == 0) {
                result = 8;
            } else if (point == 1) {
                result = 9;
            } else if (point == 2) {
                result = 10;
            } else if (point == 3) {
                result = 11;
            } else if (point == 4) {
                result = 12;
            } else if (point == 5) {
                result = 13;
            } else if (point == 7) {
                result = 14;
            } else if (point == 9) {
                result = 15;
            } else if (point == 12) {
                result = 16;
            } else if (point == 15) {
                result = 17;
            } else if (point == 19) {
                result = 18;
            } else if (point == 23) {
                result = 19;
            }
            
            return result;
        }
        
        public void RaceDwarf() {
            cons += 2;
            speed = 25;
            size = 4.5;
            
            if(age>=50) {adult = true;}
            if(age<50) {adult = false;}
        }
        
        public void RaceElf(){
            dxtr += 2;
            speed = 30;
            size = 5.5;
            
            if(age>=100) {adult = true;}
            if(age<100) {adult = false;}
        }
        
        public void RaceHalfling() {
            dxtr += 2;
            speed = 25;
            size = 4.0;
            
            if(age>=20) {adult = true;}
            if(age<20) {adult = false;}
            
        }
        
        public void RaceHuman() {
            strn += 1;
            dxtr += 1;
            cons += 1;
            intl += 1;
            wsdm += 1;
            chrm += 1;
            speed = 30;
            size = 5.5;
            
            if(age>=18) {adult = true;}
            if(age<18) {adult = false;}
        }
        
        public void PrintToString() {
            System.out.println("Name: " + Name + " " + ClanOrFamily);
            System.out.println("Strength: " + strn);
            System.out.println("Dexterity: " + dxtr);
            System.out.println("Constitution: " + cons);
            System.out.println("Intelligence: " + intl);
            System.out.println("Wisdom: " + wsdm);
            System.out.println("Charisma: " + chrm);
            System.out.println("Speed: " + speed + "feet");
            System.out.println("Size: " + size + "feet");
            System.out.println("Is adult? " + adult);
        }
    }
}
