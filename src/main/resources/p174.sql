SELECT m.member_id, m.username, m.team_id, t.name
  from member m
    join team t on m.team_id=t.team_id;