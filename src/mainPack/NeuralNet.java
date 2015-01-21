/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPack;

import java.util.ArrayList;

/**
 *
 * @author Dasty
 */
public class NeuralNet 
{
    private int numInputs;
    private int numOutputs;
    private int numHiddenLayers;
    private int numNodesPerHiddenLayer;
    
    public ArrayList<double[][]> annWeights;
    
    public NeuralNet(int ni, int no, int nl, int nn)
    {
        numInputs = ni;
        numOutputs = no;
        numHiddenLayers = nl;
        numNodesPerHiddenLayer = nn;

        annWeights = new ArrayList(numHiddenLayers+2); //+2 for inputs and outputs
    }
    
    public void createNet()
    {
        double[][] tempArr = new double[numInputs][numNodesPerHiddenLayer+1];

        for(int i = 0;i < numInputs; i++)
        {
            for(int j = 0;j < numNodesPerHiddenLayer + 1;j++)
            {
                tempArr[i][j] = Math.random();
            }
        }
        
        annWeights.add(tempArr);
        
        for(int x = 0;x < numHiddenLayers;x++)
        {
            tempArr = new double[numNodesPerHiddenLayer][numOutputs+1];

            for(int i = 0;i < numNodesPerHiddenLayer; i++)
            {
                for(int j = 0;j < numOutputs + 1;j++)
                {
                    tempArr[i][j] = Math.random();
                }
            }
            annWeights.add(tempArr);
        }
        
        tempArr = new double[numNodesPerHiddenLayer][1];

        for(int i = 0;i < numNodesPerHiddenLayer; i++)
        {
            tempArr[i][0] = Math.random();
        }
        
        annWeights.add(tempArr);
    } 
    
    
    public double[] propagateAnn(double[] inputs)
    {
        double[][] next = new double[numNodesPerHiddenLayer][numInputs];
    }
}
