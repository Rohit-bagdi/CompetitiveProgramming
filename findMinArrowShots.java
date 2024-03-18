class Solution {
    public int findMinArrowShots(int[][] points) {

        Arrays.sort(points, Comparator.comparingDouble(o -> o[0]));
int result = 1;
int endrange =points[0][1];
//int startrange =points[1][0];
for(int i =1;i<points.length;i++)
{
    if(points[i][0]>endrange)
    {
        result++;
        endrange=points[i][1];
    }
    endrange = Math.min(endrange,points[i][1]);
}



      //  System.out.println(Arrays.toString(points));
    return result;
    }
}
