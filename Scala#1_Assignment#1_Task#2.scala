//Given a list of strings
var strlist = List("alpha", "gamma", "omega", "zeta", "beta")
//find count of all strings with length 4
strlist.count(s => s.length == 4)
//convert the list of string to a list of integers, where each string is mapped to its corresponding length
strlist.map(s => s.length)
//find count of all strings which contain alphabet ‘m’
strlist.count(s => s.indexOf('m') >= 0)
//find the count of all strings which start with the alphabet ‘a’
strlist.count(s => s.indexOf('a') == 0)
