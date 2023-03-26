export * from './acceptHeaderOpenApiResource.service';
import { AcceptHeaderOpenApiResourceService } from './acceptHeaderOpenApiResource.service';
export * from './bookResource.service';
import { BookResourceService } from './bookResource.service';
export * from './default.service';
import { DefaultService } from './default.service';
export * from './openApiResource.service';
import { OpenApiResourceService } from './openApiResource.service';
export const APIS = [AcceptHeaderOpenApiResourceService, BookResourceService, DefaultService, OpenApiResourceService];
