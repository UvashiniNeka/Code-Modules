
-- 24. Average Session Duration per Event
SELECT e.title, AVG(TIMESTAMPDIFF(MINUTE, s.start_time, s.end_time)) AS avg_duration_mins
FROM Events e
JOIN Sessions s ON e.event_id = s.event_id
GROUP BY e.event_id;
