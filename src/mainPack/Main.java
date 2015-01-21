/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPack;


/**
 *
 * @author Dasty
 */
public class Main 
{
    public static void main(String[] args)
    {
        NeuralNet ann = new NeuralNet(20,3,1,4);
        ann.createNet();
        for(int i = 0; i < ann.annWeights.get(1).length; i++)
        {
            for(int j = 0; j < ann.annWeights.get(1)[i].length; j++)
                System.out.print(Math.round(ann.annWeights.get(1)[i][j]*100)+", ");
            System.out.println();
        }
    }
}
