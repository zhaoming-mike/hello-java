// ==UserScript==
// @name         海度宽度调大
// @namespace    http://tampermonkey.net/
// @version      0.1
// @description  try to take over the world!
// @author       You
// @match        https://udb.hiido.com/info/staff_list.php
// @grant        none
// ==/UserScript==

(function () {
    //alert('测试一下');
    document.getElementById("main").setAttribute("style", "width:1650px;");
})();
