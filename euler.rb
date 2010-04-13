require 'open-uri'
require 'rubygems'
require 'nokogiri'

url = 'http://projecteuler.net/index.php?section=problems'
base_url = 'http://projecteuler.net/'
doc = Nokogiri::HTML(open(url))
doc.css("a[title='Click to view problem']").each_with_index do |element, index|
  problem_url = "#{base_url}#{element['href']}"
  puts problem_url
  File.open("problems/#{index + 1}.html", 'w') do |file|
    file.write Nokogiri::HTML(open(problem_url))
  end
end

