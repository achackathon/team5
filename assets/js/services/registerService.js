(function(eaApp, angular, $) {
	'use strict';

	eaApp.service('registerService', function($http) {
		return {
			addNewItem: function(newItem) {
				return $http.post('accessibility', newItem);
			}
		}
	});

})(angular.module('eaApp'), window.angular, window.jQuery);