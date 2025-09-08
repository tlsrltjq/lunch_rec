<!DOCTYPE html>
<html>
<head>
    <title>점심 메뉴 등록</title>
</head>
<body>
<h1>점심 메뉴 등록</h1>
<form action="/post" method="post">
    메뉴이름 : <input type="text" name="m_name"><br>
    가격 :
    <select id="price" name="price">
        <option value="0">0-10000</option>
        <option value="1">10000-30000</option>
        <option value="2">30000-50000</option>
        <option value="3">50000-</option>
    </select>
    맵기 :
        <select id="spice" name="spice">
            <option value="0">매움</option>
            <option value="1">보통</option>
            <option value="2">순함</option>
        </select>
    <button type="submit">등록</button>
</form>
</body>
</html>