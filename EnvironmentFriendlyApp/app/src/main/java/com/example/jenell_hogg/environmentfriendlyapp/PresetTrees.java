package com.example.jenell_hogg.environmentfriendlyapp;

/**
 * Created by a on 28/01/17.
 */

public class PresetTrees {
    public Tree[] getTrees() {
        Tree[] trees = new Tree[3];
        trees[0].setLatitude(43.2556);
        trees[0].setLongitude(-79.8712);
        trees[0].setTreeNumber(2252175);
        trees[0].setCommonName("Tree of Heaven");
        trees[0].setScientificName("Ailanthus altissima");
        trees[0].setTrunkDiameter(40);
        trees[0].setTreeHeight(20);
        trees[0].setCanopyHeight(10);

        trees[0].setLocation("Back Yard");
        trees[0].setPercentHardSurface(100);
        trees[0].setStatus("Existing Tree");

        return trees;
    }
}
