package ps.baekjun.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class GasStation {

    public static void main(String[] args) throws IOException {
//        String[]  a = {"2 3 1"};
//        String[] towns = {"5 2 4 1"};
//
//        String[] a2 = {"3 3 4 "};
//        String[] town2 = {"1 1 1 1"};
//
//        String[] a3 = {"4 2 3 4"};
//        String[] town3 = {"5 3 2 4 2"};
//
//        String[] a4 = {"1 3 2 4"};
//        String[] town4 = {"2 4 3 4 2"};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long town = Integer.parseInt(br.readLine()); // 도시 개수
        long[] distances = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray(); // 도시 간 거리
        long[] prices = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray(); // 도시별 기름값


        long cost = 0; // 총 비용
        long cheapest = prices[0]; // 현재 가장 싼 기름

        for(int i = 0; i < distances.length; i++){

            if(prices[i] < cheapest){ // 다음 도시 기름 값이 싸면 그 기름 값을 대입
                cheapest = prices[i];
            }

            cost += cheapest * distances[i];

        }

//        for(int i = 0; i < twoDim.length; i++){
//
//            if(cheapest > twoDim[j][0]){
//                distance = twoDim[i][1];
//                cost += distance * cheapest;
//                cheapest = twoDim[j][0];
//                ownDistance = twoDim[j][1];
//                j++;
//            } else {
//                distanceCount += twoDim[j][1];
//
//                for(int i1 = j+1; i1 < twoDim.length; i1++){
//
//                    if(cheapest <= twoDim[i1][0]){
//                        distanceCount += twoDim[i1][1];
//                    } else {
////                        cost += (distanceCount + ownDistance) * cheapest;
//                        cheapest = twoDim[i1][0];
//                        ownDistance = twoDim[i1][1];
//                        break;
//                    }
//                }
//                cost += (distanceCount + ownDistance) * cheapest;
//            }
//
//        }

//        for(int i = 1; i < town - 1; i++){
//            distance += twoDim[i];
//
//            // 현재 도시의 기름값이 다음 도시 기름값보다 비싸면 필요한 기름만큼만 채우고 다음 도시로 이동
//            if(cheapest > twoDim[i][0]){
//                cost += cheapest * distance; // 현재 도시의 기름 * 다음 도시 이동까지의 거리
//                cheapest = twoDim[i];
//            } else {
//                distance += distances[i-1];
//
//
//
//
////                for(int j = i; j < town -1; j++){
////                    if(cheapest <= twoDim[j]){
////                        modCount += distances[j];
////                    } else {
////                        cost += modCount * cheapest;
////                        cheapest = twoDim[j];
////                        break;
////                    }
////                }
//
//            }
//
//        }

        System.out.println(cost);

    }
}
