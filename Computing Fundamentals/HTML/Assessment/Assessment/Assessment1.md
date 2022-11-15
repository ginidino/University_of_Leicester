# CW2 Assessment2
## Desing a webpage
To design a website containing Personal Development Plan (PDP).

HTML Code
```html
<!DOCTYPE html>
<html>
  <head>
    <title>il74-CW2</title>
      <link rel="stylesheet" href="./style.css">
  </head>
  <body>
    <div class="header">
      <h1>Student Personal Development Plan</h1>
      <hr>
    </div>
    <div class="detail">
      <p>Student Name: <input type="text" placeholder="Student name"/style="height:18px;"> </p>
      <p>User ID: <input type="text" placeholder="User ID"/style="height:18px;"> </p>
      <p><label>Period Covered: </label>
      <select id="Semester">
        <option value=""> Choose Semester </option>
        <option value="Semester1">Semester1</option>
        <option value="Semester2">Semester2</option>
        <option value="Semester3">Semester3</option>
      </select>
      (<input type="date"/style="height:18px;"> - <input type="date"/style="height:18px;">)</p>
      <p>Appraiser/ Personal Tutor: <input type="text" placeholder="Appraiser/Personal Tutor"/style="width:250px;height:18px;"> </p>
    </div>
    <br>
    <table id = "table1">
      <tr>
        <th>Objective/Task/Activity</th>
        <th>How would you accomplish this?</th>
        <th>Mid-year progress</th>
        <th>Year-end outcome</th>
      </tr>
      <tr>
        <td>Academic achievement</td>
        <td>
          Aim:<br> <input type="text" /style="width:300px;"><br>
          How:<br> <input type="text" /style="width:300px;"><br>
          Challenges:<br> <input type="text" /style="width:300px;"><br>
          Overcome:<br> <input type="text" /style="width:300px;">
        </td>
        <td>
          Aim:<br> <input type="text" /style="width:300px;"><br>
          How:<br> <input type="text" /style="width:300px;"><br>
          Challenges:<br> <input type="text" /style="width:300px;"><br>
          Overcome:<br> <input type="text" /style="width:300px;">
        </td>
        <td>
          Aim:<br> <input type="text" /style="width:300px;"><br>
          How:<br> <input type="text" /style="width:300px;"><br>
          Challenges:<br> <input type="text" /style="width:300px;"><br>
          Overcome:<br> <input type="text" /style="width:300px;">
        </td>
      </tr>
      <tr>
        <td>Organizational and study skills</td>
        <td>
          Aim:<br> <input type="text" /style="width:300px;"><br>
          How:<br> <input type="text" /style="width:300px;"><br>
          Challenges:<br> <input type="text" /style="width:300px;"><br>
          Overcome:<br> <input type="text" /style="width:300px;">
        </td>
        <td>
          Aim:<br> <input type="text" /style="width:300px;"><br>
          How:<br> <input type="text" /style="width:300px;"><br>
          Challenges:<br> <input type="text" /style="width:300px;"><br>
          Overcome:<br> <input type="text" /style="width:300px;">
        </td>
        <td>
          Aim:<br> <input type="text" /style="width:300px;"><br>
          How:<br> <input type="text" /style="width:300px;"><br>
          Challenges:<br> <input type="text" /style="width:300px;"><br>
          Overcome:<br> <input type="text" /style="width:300px;">
        </td>
      </tr>
      <tr>
        <td>Leadership skills</td>
        <td>
          Aim:<br> <input type="text" /style="width:300px;"><br>
          How:<br> <input type="text" /style="width:300px;"><br>
          Challenges:<br> <input type="text" /style="width:300px;"><br>
          Overcome:<br> <input type="text" /style="width:300px;">
        </td>
        <td>
          Aim:<br> <input type="text" /style="width:300px;"><br>
          How:<br> <input type="text" /style="width:300px;"><br>
          Challenges:<br> <input type="text" /style="width:300px;"><br>
          Overcome:<br> <input type="text" /style="width:300px;">
        </td>
        <td>
          Aim:<br> <input type="text" /style="width:300px;"><br>
          How:<br> <input type="text" /style="width:300px;"><br>
          Challenges:<br> <input type="text" /style="width:300px;"><br>
          Overcome:<br> <input type="text" /style="width:300px;">
        </td>
      </tr>
      <tr>
        <td>Teamwork</td>
        <td>
          Aim:<br> <input type="text" /style="width:300px;"><br>
          How:<br> <input type="text" /style="width:300px;"><br>
          Challenges:<br> <input type="text" /style="width:300px;"><br>
          Overcome:<br> <input type="text" /style="width:300px;">
        </td>
        <td>
          Aim:<br> <input type="text" /style="width:300px;"><br>
          How:<br> <input type="text" /style="width:300px;"><br>
          Challenges:<br> <input type="text" /style="width:300px;"><br>
          Overcome:<br> <input type="text" /style="width:300px;">
        </td>
        <td>
          Aim:<br> <input type="text" /style="width:300px;"><br>
          How:<br> <input type="text" /style="width:300px;"><br>
          Challenges:<br> <input type="text" /style="width:300px;"><br>
          Overcome:<br> <input type="text" /style="width:300px;">
        </td>
      </tr>
      <tr>
        <td>Presentation and communication skills</td>
        <td>
          Aim:<br> <input type="text" /style="width:300px;"><br>
          How:<br> <input type="text" /style="width:300px;"><br>
          Challenges:<br> <input type="text" /style="width:300px;"><br>
          Overcome:<br> <input type="text" /style="width:300px;">
        </td>
        <td>
          Aim:<br> <input type="text" /style="width:300px;"><br>
          How:<br> <input type="text" /style="width:300px;"><br>
          Challenges:<br> <input type="text" /style="width:300px;"><br>
          Overcome:<br> <input type="text" /style="width:300px;">
        </td>
        <td>
          Aim:<br> <input type="text" /style="width:300px;"><br>
          How:<br> <input type="text" /style="width:300px;"><br>
          Challenges:<br> <input type="text" /style="width:300px;"><br>
          Overcome:<br> <input type="text" /style="width:300px;">
        </td>
      </tr>
    </table>
    <br>
    <div class="comment">
      <p>Appraiser/ Personal Tutor Comments</p>
    </div>
    <table id = "table2">
      <tr>
        <td>Mid-year Progress </td>
        <td><input type="text" /style="width:1200px;height:20px;"></td>
      </tr>
      <tr>
        <td>Year-end Outcome </td>
        <td><input type="text" /style="width:1200px;height:20px;"></td>
      </tr>
    </table>
    <br>
  </body>
</html>
```

CSS Code
```css
/** {
  margin: 8px;
}*/

.header {
  text-align: center;
  font-family: Arial, sans-serif;
  padding: 20px;
}

.detail {
  text-align: left;
  font-family: Arial, sans-serif;
  font-size: 20px;
  font-weight: bolder;
  padding: 20px;
}

#Semester {
  font-size: 18px;
  font-family: Arial, sans-serif;
}

input {
  font-size:20px;
  font-family: Arial, sans-serif;
}

table {
  border: 1px;
  border-style: solid;
  border-collapse: collapse;
}

th {
  border: 1px;
  border-style: solid;
  border-collapse: collapse;
  font-weight: bolder;
  padding: 10px;

}

td {
  border: 1px;
  border-style: solid;
  border-collapse: collapse;
  padding: 10px;
}

#table1 {
  border: 1px;
  border-style: solid;
  border-collapse: collapse;
  text-align: left;
  font-family: Arial, sans-serif;
  width: 100%;
}

#table2 {
  border: 1px;
  border-style: solid;
  border-collapse: collapse;
  text-align: left;
  font-family: Arial, sans-serif;
  width: 100%;
}

.comment {
  text-align: left;
  font-family: Arial, sans-serif;
  font-weight: bolder;
  font-size: 20px;
  padding: 20px;
}
```
