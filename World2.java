import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World2 extends World
{

    static World2 w2=new World2();
    public World2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Suspect1 suspect1 = new Suspect1();
        addObject(suspect1,414,502);
        Suspect2 suspect2 = new Suspect2();
        addObject(suspect2,643,489);
        suspect1.setLocation(325,430);
        suspect2.setLocation(612,417);
        suspect1.setLocation(331,440);
        suspect2.setLocation(556,441);
        suspect2.setLocation(514,436);
        removeObject(suspect2);
        Note2 note2 = new Note2();
        addObject(note2,295,23);
        note2.setLocation(289,19);
        note2.setLocation(287,19);
        Board board = new Board();
        addObject(board,964,339);
        note2.setLocation(170,19);
        board.setLocation(517,54);
        Board board2 = new Board();
        addObject(board2,726,79);
        board2.setLocation(720,54);
        Board board3 = new Board();
        addObject(board3,1144,80);
        board3.setLocation(1128,54);
        Board board4 = new Board();
        addObject(board4,949,61);
        board4.setLocation(977,55);
        Board board5 = new Board();
        addObject(board5,853,62);
        board4.setLocation(974,53);
        board5.setLocation(849,53);
        board2.setLocation(673,53);
        board5.setLocation(818,54);
        board5.setLocation(821,52);
        board.setLocation(493,53);
        board2.setLocation(653,53);
        board5.setLocation(809,52);
        Evidence2 evidence2 = new Evidence2();
        addObject(evidence2,497,63);
        evidence2.setLocation(491,52);
        Evidence5 evidence5 = new Evidence5();
        addObject(evidence5,659,55);
        evidence5.setLocation(650,52);
        Evidence3 evidence3 = new Evidence3();
        addObject(evidence3,812,56);
        evidence3.setLocation(806,50);
        Evidence4 evidence4 = new Evidence4();
        addObject(evidence4,976,63);
        evidence4.setLocation(970,55);
        Evidence evidence = new Evidence();
        addObject(evidence,1138,63);
        evidence.setLocation(1130,59);
        suspect2.setLocation(110,399);
        Suspect2 suspect23 = new Suspect2();
        addObject(suspect23,874,388);
        Suspect3 suspect3 = new Suspect3();
        addObject(suspect3,998,439);
        suspect3.setLocation(387,393);
        Suspect4 suspect4 = new Suspect4();
        addObject(suspect4,861,431);
        suspect4.setLocation(1024,396);
        suspect23.setLocation(747,377);
        suspect4.setLocation(996,396);
        suspect23.setLocation(727,383);
        suspect3.setLocation(465,383);
        suspect2.setLocation(218,385);
        suspect2.setLocation(189,386);
        suspect23.setLocation(741,384);
        suspect3.setLocation(466,383);
        suspect3.setLocation(471,381);
        suspect3.setLocation(473,382);
        suspect4.setLocation(999,381);
        suspect23.setLocation(748,376);
        suspect3.setLocation(483,372);
        suspect2.setLocation(187,372);
        suspect23.setLocation(749,366);
        suspect1.setLocation(207,366);
        suspect1.setLocation(210,366);
        suspect1.setLocation(229,374);
        suspect2.setLocation(747,388);
        suspect3.setLocation(483,387);
        suspect1.setLocation(212,387);
        suspect1.setLocation(209,389);
        suspect3.setLocation(466,387);
        suspect2.setLocation(733,385);
        suspect1.setLocation(594,411);
        suspect3.setLocation(427,385);
        suspect1.setLocation(563,371);
        suspect3.setLocation(217,339);
        suspect1.setLocation(501,370);
        suspect3.setLocation(241,371);
        suspect1.setLocation(496,367);
    }
}
