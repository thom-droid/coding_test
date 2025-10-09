WITH rented AS ( SELECT h.car_id
                 FROM car_rental_company_rental_history h
                 WHERE (h.end_date >= '2022-11-01' AND h.start_date <= '2022-11-30') ),
     available_cars AS ( SELECT car_id, daily_fee, car_type
                         FROM car_rental_company_car c
                         WHERE c.car_id NOT IN ( SELECT r.car_id FROM rented r ) ),
     c AS ( SELECT ac.car_id,
                   ac.car_type,
                   discount_rate,
                   daily_fee,
                   ROUND((daily_fee * 30) * (1 - (discount_rate / 100)), 0) AS fee
            FROM available_cars                   ac
            JOIN car_rental_company_discount_plan dp ON ac.car_type = dp.car_type
            WHERE dp.duration_type = '30일 이상'
              AND ac.car_type IN ('SUV', '세단') )
SELECT car_id, car_type, fee
FROM c
WHERE fee >= 500000
  AND fee <= 2000000
ORDER BY fee DESC, car_type, car_id;

-- 1. 2022년 11월에 대여되지 않은 차량을 찾기 위해 rented CTE를 생성
-- 2. rented CTE를 사용하여 대여되지 않은 차량을 available_cars CTE에서 필터링
-- 3. available_cars CTE와 car_rental_company_discount_plan 테이블을 조인하여 할인된 월간 요금을 계산
-- 4. 최종 결과에서 계산된 요금이 500,000원 이상 2,000,000원 이하인 차량을 선택하고 정렬
-- 5. 결과는 차량 ID, 차량 유형, 할인된 월간 요금을 포함하며, 요금 내림차순, 차량 유형 오름차순, 차량 ID 오름차순으로 정렬
-- 6. CTE와 서브쿼리를 활용하여 가독성과 유지보수성을 높임
-- 7. SQL 표준 함수와 구문을 사용하여 데이터베이스 간 호환성을 고려
-- 8. 쿼리 성능 최적화를 위해 인덱스 사용을 고려
-- 9. 날짜 비교 시 명확한 범위 조건을 사용하여 정확한 결과 도출
