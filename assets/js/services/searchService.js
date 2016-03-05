(function(eaApp, angular, $) {
	'use strict';

	eaApp.service('searchService', function($http) {
		return {
			listCategories: function() {
				return $http.get('category');
			},
			search: function(searchText) {
				return $http.get('places/search/' + searchText + '/');
			}
		}
	});

})(angular.module('eaApp'), window.angular, window.jQuery);