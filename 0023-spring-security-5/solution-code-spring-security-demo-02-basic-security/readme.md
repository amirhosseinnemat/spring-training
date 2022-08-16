**readme :**
# spring security sample:
### in this sample, display user `based on content`.

```html
    <sec:authorize access="hasRole('MANAGER')">
      <a href="${pageContext.request.contextPath}/leaders">Manager Page</a> (only for manager) <br>
    </sec:authorize>
```

